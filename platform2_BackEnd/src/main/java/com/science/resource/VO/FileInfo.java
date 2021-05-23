package com.science.resource.VO;

import lombok.Data;

import java.util.Date;

@Data
public class FileInfo {
    private String name;
    private Date time;
    private String url;
}
