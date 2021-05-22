package com.science.resource.controller;


import com.science.resource.VO.UserToken;
import com.science.resource.common.CommonResult;
import com.science.resource.entity.Apply;
import com.science.resource.entity.ServiceOrder;
import com.science.resource.entity.ServiceTable;
import com.science.resource.security.annotation.LoginUser;
import com.science.resource.service.ApplyService;
import com.science.resource.service.ServiceOrderService;
import com.science.resource.service.ServiceTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Minghao Shi
 * @since 2021-03-30
 */
@RestController
@RequestMapping("/resource/apply")
public class ApplyController {
    @Autowired
    ApplyService applyService;
    @Autowired
    ServiceOrderService serviceOrderService;
    @Autowired
    ServiceTableService serviceTableService;
    @PostMapping("/create")
    public CommonResult applyAdd(@LoginUser UserToken usertoken, @RequestBody Apply apply) {
        //System.out.println(usertoken.getUserId());
        Date date = new Date();
        apply.setCreateTime(date);
        apply.setCustomerId(usertoken.getUserId());
        applyService.save(apply);
        ServiceTable serviceTable = serviceTableService.getById(apply.getServiceId());
        ServiceOrder serviceOrder = new ServiceOrder(apply.getServiceId(),serviceTable.getServerId(),apply.getCustomerId(),apply.getId(),apply.getCreateTime());
        return CommonResult.success(serviceOrderService.save(serviceOrder));
    }

}

