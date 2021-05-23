package com.science.resource.mapper;

import com.science.resource.VO.FileInfo;
import com.science.resource.VO.OrderShow;
import com.science.resource.entity.ServiceOrder;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.swagger.models.auth.In;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Minghao Shi
 * @since 2021-03-29
 */
public interface ServiceOrderMapper extends BaseMapper<ServiceOrder> {
    @Select({"select distinct service_table.server_id as serverId, service_order.order_id as orderId, service_table.service_name as serviceName, apply.contact_name as server," +
            " service_order.create_time as createTime, service_order.process_id as processId, service_order.note from service_order, " +
            "service_table, apply " +
            "where " +
            "service_order.service_id=service_table.service_id and " +
            "service_order.apply_id = apply.id and " +
            "service_order.is_done = 0"})
    List<OrderShow> getSerUndoOrderShow(@Param("server_id") Integer server_id);

    @Select({"select distinct service_table.server_id as serverId, service_order.order_id as orderId, service_table.service_name as serviceName," +
            " apply.contact_name as server, service_order.create_time as createTime, " +
            "service_order.is_done as processId, service_order.note " +
            "from service_order, service_table, apply " +
            "where " +
            "service_order.service_id=service_table.service_id and " +
            "service_order.apply_id = apply.id and service_order.is_done != 0"})
    List<OrderShow> getSerDoneOrderShow(@Param("server_id") Integer server_id);

    @Select({"select distinct service_order.order_id as orderId, service_table.service_name as serviceName, " +
            "service_table.service_provider as server, service_order.create_time as createTime, " +
            "service_order.process_id as processId, service_order.note " +
            "from service_order, service_table " +
            "where service_order.customer_id = #{customer_id} and " +
            "service_order.service_id=service_table.service_id and " +
            "service_order.is_done = 0"})
    List<OrderShow> getCustUndoOrderShow(@Param("customer_id") Integer customer_id);

    @Select({"select distinct service_order.order_id as orderId, service_table.service_name as serviceName, service_table.service_provider as server, " +
            "service_order.create_time as createTime, service_order.is_done as processId, service_order.note from service_order, service_table " +
            "where service_order.customer_id = #{customer_id} and " +
            "service_order.service_id=service_table.service_id and " +
            "service_order.is_done != 0"})
    List<OrderShow> getCustDoneOrderShow(@Param("customer_id") Integer customer_id);

    @Select({"update service_order set process_id = #{state} where order_id = #{order_id} "})
    void updateState(@Param("order_id") Integer order_id, @Param("state")Integer state);

    @Select({"update service_order set s_conversation_comment_score = #{rate}, s_conversation_comment_text = #{text} where order_id = #{order_id}"})
    void sCommuniCommend(@Param("order_id") Integer order_id, @Param("rate")Integer rate, @Param("text")String text);

    @Select({"update service_order set c_conversation_comment_score = #{rate}, c_conversation_comment_text = #{text} where order_id = #{order_id}"})
    void cCommuniCommend(@Param("order_id") Integer order_id, @Param("rate")Integer rate, @Param("text")String text);

    @Select({"update service_order set s_cooperate_score = #{feel}, s_evaluation_score = #{comment} where order_id = #{order_id}"})
    void sComment(@Param("order_id") Integer order_id, @Param("comment")Integer comment, @Param("feel")Integer feel);

    @Select({"update service_order set completeness = #{comple}, punctuality = #{punct} where order_id = #{order_id}"})
    void cCheck(@Param("order_id") Integer order_id, @Param("comple")Integer comple, @Param("punct")Integer punct);

    @Select({"update service_order set c_cooperate_score = #{feel}, c_evaluation_score = #{comment}, professional_level = #{prof}, response_speed = #{speed}, service_experience = #{exper}, comment_context = #{text} where order_id = #{order_id}"})
    void cComment(@Param("order_id") Integer order_id, @Param("comment")Integer comment, @Param("prof")Integer prof, @Param("speed")Integer speed, @Param("exper")Integer exper,  @Param("feel")Integer feel, @Param("text")String text);

    @Select({"select count(*) from service_order where order_id = #{order_id} and s_conversation_comment_score is not null and c_conversation_comment_score is not null"})
    boolean isCommuni(@Param("order_id") Integer order_id);

    @Select({"select count(*) from service_order where order_id = #{order_id} and s_evaluation_score is not null and c_evaluation_score is not null"})
    boolean isComment(@Param("order_id") Integer order_id);

    @Select({"update service_order set protocal=#{fileList} where order_id = #{order_id}"})
    void protocal( @Param("order_id") Integer order_id, @Param("fileList") String fileList);

    @Select({"update service_order set is_done = 1 where order_id = #{order_id}"})
    void done(@Param("order_id") Integer order_id);

    @Select({"update service_order set is_done = -1 where order_id = #{order_id}"})
    void cancle(@Param("order_id") Integer order_id);

}
