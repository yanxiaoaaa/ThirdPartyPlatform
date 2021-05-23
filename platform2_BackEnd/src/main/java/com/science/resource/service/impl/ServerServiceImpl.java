package com.science.resource.service.impl;

import com.science.resource.entity.Server;
import com.science.resource.mapper.ServerMapper;
import com.science.resource.service.ServerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Minghao Shi
 * @since 2021-03-31
 */
@Service
public class ServerServiceImpl extends ServiceImpl<ServerMapper, Server> implements ServerService {
    @Autowired
    ServerMapper serverMapper;
    @Override
    public Integer getServerId(Integer user_id) {
        return serverMapper.getServerId(user_id);
    }
}
