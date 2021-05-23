package com.science.resource.mapper;

import com.science.resource.entity.Server;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Minghao Shi
 * @since 2021-03-31
 */
public interface ServerMapper extends BaseMapper<Server> {
    @Select({"select  server.id from server, user where user.userid = #{user_id} and server.user_id = user.userid"})
    Integer getServerId(@Param("user_id") Integer user_id);
}
