package com.science.resource.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.science.resource.VO.UserToken;
import com.science.resource.VO.UserVO;
import com.science.resource.common.CommonResult;
import com.science.resource.entity.User;
import com.science.resource.service.UserService;
import com.science.resource.util.UserTokenManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/resource")
public class LoginController {
    @Autowired
    UserService userService;

    @PostMapping("/login")
    public CommonResult login(@RequestBody UserVO user, HttpServletResponse response){

       User dbUser= userService.getOne(Wrappers.<User>lambdaQuery().eq(User::getAccount,user.getAccount()));
       if(dbUser == null){
           return CommonResult.validateFailed("用户不存在");
       }
       if (user.getAccount().equals(dbUser.getAccount())&&user.getPassword().equals(dbUser.getPassword())){
           String token = UserTokenManager.generateToken(dbUser.getUserid());
           response.addHeader("access_token",token);
           return CommonResult.success(new UserToken(dbUser.getUserid(),dbUser.getCurrentAuthority()));
       }
        return CommonResult.validateFailed("用户名或密码不正确");
    }
}
