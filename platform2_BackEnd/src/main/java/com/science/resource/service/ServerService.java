package com.science.resource.service;

import com.science.resource.entity.Server;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Minghao Shi
 * @since 2021-03-31
 */
public interface ServerService extends IService<Server> {
    Integer getServerId(Integer user_id);
}
