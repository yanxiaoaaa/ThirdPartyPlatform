package com.science.resource.service.impl;

import com.science.resource.entity.User;
import com.science.resource.mapper.UserMapper;
import com.science.resource.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author Minghao Shi
 * @since 2021-03-30
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
