package com.science.resource.controller;


import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.science.resource.VO.UserToken;
import com.science.resource.VO.UserVO;
import com.science.resource.common.CommonResult;
import com.science.resource.entity.User;
import com.science.resource.security.annotation.LoginUser;
import com.science.resource.service.UserService;
import com.science.resource.util.UserTokenManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author Minghao Shi
 * @since 2020-12-15
 */
@Slf4j
@RestController
@RequestMapping("/resource/user")
public class UserController {
    final
    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/currentUser")
    public CommonResult login(@LoginUser UserToken user){
        log.info("after login user:"+user.toString());
        User dbUser= userService.getById(user.getUserId());
        return CommonResult.success(dbUser);
    }


}

