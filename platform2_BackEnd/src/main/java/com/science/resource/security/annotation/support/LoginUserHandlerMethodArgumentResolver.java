package com.science.resource.security.annotation.support;


import com.science.resource.VO.UserToken;
import com.science.resource.exception.LoginException;
import com.science.resource.security.annotation.LoginUser;
import com.science.resource.util.UserTokenManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import javax.servlet.http.HttpServletResponse;

@Slf4j
@Component
public class LoginUserHandlerMethodArgumentResolver implements HandlerMethodArgumentResolver {
    public static final String LOGIN_TOKEN_KEY = "access_token";
    public static final String REFRESH_TOKEN_KEY = "refresh_token";

    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        return parameter.getParameterType().isAssignableFrom(UserToken.class) && parameter.hasParameterAnnotation(LoginUser.class);
    }

    @Override
    public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer container,
                                  NativeWebRequest request, WebDataBinderFactory factory) {
        String token = request.getHeader(LOGIN_TOKEN_KEY);
        log.info("token",token);
        if (token == null || token.isEmpty()) {
            log.info("认证失败");
            throw new LoginException();
        }
        Integer userId = UserTokenManager.getUserId(token);
        if (userId != null){
            UserToken userToken = new UserToken();
            HttpServletResponse response =  request.getNativeResponse(HttpServletResponse.class);
            String newToken = UserTokenManager.generateToken(userId);
            response.setHeader(LOGIN_TOKEN_KEY,newToken);
            userToken.setUserId(userId);
            log.info("token",userToken);
            return userToken;
        }

        throw new LoginException();
    }
}
