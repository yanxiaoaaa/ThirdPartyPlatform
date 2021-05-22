package com.science.resource.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.baomidou.mybatisplus.annotation.IEnum;
import com.fasterxml.jackson.annotation.JsonValue;

public enum GenderEnum implements IEnum<Integer> {

    MALE(1, "男"),
    FEMALE(2, "女");

    public int getCode() {
        return code;
    }

    public String getDescp() {
        return descp;
    }
    public static GenderEnum parse(Integer code) {
        for (GenderEnum value : values()) {
            if (value.code == code) {
                return value;
            }
        }
        return null;
    }
    @EnumValue
    private final int code;

    private final String descp;

    GenderEnum(int code, String descp) {
        this.code = code;
        this.descp = descp;
    }

    @Override
    public Integer getValue() {
        return this.code;
    }
}