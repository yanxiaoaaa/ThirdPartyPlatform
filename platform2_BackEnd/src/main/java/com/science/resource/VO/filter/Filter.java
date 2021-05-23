package com.science.resource.VO.filter;

import java.util.Arrays;

public class Filter {
    private String field;
    private OP op;
    private String[] value;

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public OP getOp() {
        return op;
    }

    public void setOp(OP op) {
        this.op = op;
    }

    public String[] getValue() {
        return value;
    }

    public void setValue(String[] value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Filter{" +
                "field='" + field + '\'' +
                ", op=" + op +
                ", value=" + Arrays.toString(value) +
                '}';
    }
}

enum OP{
    contains, equal, notequal, beginwith, endwith, less, lessorequal, greater, greaterorequal, range
}
