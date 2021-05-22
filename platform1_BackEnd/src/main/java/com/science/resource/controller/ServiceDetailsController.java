package com.science.resource.controller;


import com.science.resource.common.CommonResult;
import com.science.resource.entity.ServiceDetails;
import com.science.resource.service.ServiceDetailsService;
import com.science.resource.service.ServiceOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Minghao Shi
 * @since 2021-03-30
 */
@RestController
@RequestMapping("/resource/serviceDetails")
public class ServiceDetailsController {
    @Autowired
    ServiceDetailsService serviceDetailsService;
    @PostMapping("/query")
    public CommonResult queryOrder(@RequestBody Integer order_id){
        System.out.println(serviceDetailsService.queryOrder(order_id));
        return CommonResult.success(serviceDetailsService.queryOrder(order_id));
    }
    @PostMapping("/custquery")
    public CommonResult queryCustOrder(@RequestBody Integer order_id){
        System.out.println(serviceDetailsService.queryCustOrder(order_id));
        return CommonResult.success(serviceDetailsService.queryCustOrder(order_id));
    }
}

