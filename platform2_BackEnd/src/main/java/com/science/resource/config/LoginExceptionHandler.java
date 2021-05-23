package com.science.resource.config;

import com.science.resource.common.CommonResult;
import com.science.resource.exception.LoginException;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import static com.science.resource.common.ResultCode.UNAUTHORIZED;


@ControllerAdvice
@Order( value = Ordered.HIGHEST_PRECEDENCE )
public class LoginExceptionHandler {
    @ExceptionHandler(LoginException.class)
    @ResponseBody
    public Object unauthorizedHandler(LoginException e) {
        return CommonResult.failed(UNAUTHORIZED);
    }

}
