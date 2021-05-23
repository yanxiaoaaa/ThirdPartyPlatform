package com.science.resource.service;

import com.science.resource.VO.OrderDetails;
import com.science.resource.entity.ServiceDetails;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Minghao Shi
 * @since 2021-03-30
 */
public interface ServiceDetailsService extends IService<ServiceDetails> {
    List<OrderDetails> queryOrder(Integer order_id);
    List<OrderDetails> queryCustOrder(Integer order_id);
}
