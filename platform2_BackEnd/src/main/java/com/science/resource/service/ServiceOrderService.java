package com.science.resource.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.science.resource.VO.FileInfo;
import com.science.resource.VO.OrderShow;
import com.science.resource.entity.ServiceOrder;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Minghao Shi
 * @since 2021-03-29
 */
public interface ServiceOrderService extends IService<ServiceOrder> {
    List<OrderShow> getSerOrderShow(Integer isDone, Integer server_id);
    List<OrderShow> getCustOrderShow(Integer isDone, Integer customer_id);
    ServiceOrder updateState(Integer order_id,Integer state);
    ServiceOrder sCommuniCommend(Integer order_id, Integer rate, String text);
    ServiceOrder cCommuniCommend(Integer order_id, Integer rate, String text);
    ServiceOrder sComment(Integer order_id, Integer comment, Integer feel);
    ServiceOrder cCheck(Integer order_id, Integer comple, Integer punct);
    ServiceOrder cComment(Integer order_id, Integer comment, Integer prof, Integer speed, Integer exper, Integer feel,String text);
    boolean isCommuni(Integer order_id);
    boolean isComment( Integer order_id);
    void protocal(Integer order_id,String fileList);
    ServiceOrder done(Integer order_id);
    ServiceOrder cancle(Integer order_id);
}
