package com.science.resource.typeHandlers;

import com.science.resource.enums.GenderEnum;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@MappedJdbcTypes(JdbcType.VARCHAR) // 数据库中该字段存储的类型
@MappedTypes(GenderEnum.class) // 需要转换的对象
public class EnumHandler extends BaseTypeHandler<GenderEnum> {
    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, GenderEnum genderEnum, JdbcType jdbcType) throws SQLException {
        preparedStatement.setInt(i,genderEnum.getCode());
    }

    @Override
    public GenderEnum getNullableResult(ResultSet resultSet, String s) throws SQLException {
        int code = resultSet.getInt(s);
        GenderEnum instance = GenderEnum.parse(code);
        return instance;
    }

    @Override
    public GenderEnum getNullableResult(ResultSet resultSet, int i) throws SQLException {
        int code = resultSet.getInt(i);
        GenderEnum instance = GenderEnum.parse(code);
        return instance;
    }

    @Override
    public GenderEnum getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        return null;
    }



    /*
     * java属性 - > db属性
     */


}