package com.science.resource.mapper;

import com.science.resource.VO.OrderDetails;
import com.science.resource.VO.OrderShow;
import com.science.resource.entity.ServiceDetails;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Minghao Shi
 * @since 2021-03-30
 */
public interface ServiceDetailsMapper extends BaseMapper<ServiceDetails> {
    @Select({"select apply.contact_name as name, service_table.service_name as service, service_order.create_time as createTime, apply.contact_phone as phone, service_table.service_period as cycle, service_order.process_id, service_order.note, s_conversation_comment_score as communiDone, result_file as resultDone from apply, service_table, service_order where service_order.order_id = #{order_id} and apply.id = service_order.apply_id and service_order.service_id = service_table.service_id "})
    List<OrderDetails> queryOrder(@Param("order_id") Integer order_id);

    @Select({"select service_table.service_provider as name, service_table.service_name as service, service_order.create_time as createTime, server.phone, service_table.service_period as cycle, service_order.process_id, service_order.note, c_conversation_comment_score as communiDone, result_file as resultDone from server, service_table, service_order where service_order.order_id = #{order_id} and service_order.service_id = service_table.service_id and service_table.server_id = service_order.server_id"})
    List<OrderDetails> queryCustOrder(@Param("order_id") Integer order_id);
}
