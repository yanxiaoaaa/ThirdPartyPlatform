package com.science.resource.controller;


import com.science.resource.VO.UserToken;
import com.science.resource.common.CommonResult;
import com.science.resource.entity.ServerOrder;
import com.science.resource.security.annotation.LoginUser;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Minghao Shi
 * @since 2021-01-23
 */
@RestController
@RequestMapping("/resource/serverOrder")
public class ServerOrderController {
    @PostMapping("/creat_order")
    public CommonResult creatOrder(@LoginUser UserToken userToken,int productID){
        userToken.getUserId();
        ServerOrder serverOrder = new ServerOrder();
        serverOrder.setProductId(productID);
        return CommonResult.success(true);
    }

}

