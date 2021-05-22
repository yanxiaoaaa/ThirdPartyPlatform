package com.science.resource.VO;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class OrderDetails implements Serializable {
    private String name;
    private String service;
    private Date createTime;
    private String phone;
    private String cycle;
    private Integer processId;
    private String note;
    private Integer communiDone;
    private String resultDone;
}