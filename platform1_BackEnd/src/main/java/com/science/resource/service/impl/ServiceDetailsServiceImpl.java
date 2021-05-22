package com.science.resource.service.impl;

import com.science.resource.VO.OrderDetails;
import com.science.resource.entity.ServiceDetails;
import com.science.resource.mapper.ServiceDetailsMapper;
import com.science.resource.service.ServiceDetailsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Minghao Shi
 * @since 2021-03-30
 */
@Service
public class ServiceDetailsServiceImpl extends ServiceImpl<ServiceDetailsMapper, ServiceDetails> implements ServiceDetailsService {
    @Autowired
    ServiceDetailsMapper serviceDetailsMapper;
    @Override
    public List<OrderDetails> queryOrder(Integer order_id) {
        return serviceDetailsMapper.queryOrder(order_id);
    }
    @Override
    public List<OrderDetails> queryCustOrder(Integer order_id) {
        return serviceDetailsMapper.queryCustOrder(order_id);
    }
}
