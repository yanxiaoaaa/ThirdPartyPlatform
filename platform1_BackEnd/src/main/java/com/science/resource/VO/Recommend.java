package com.science.resource.VO;

import lombok.Data;

import java.util.List;

@Data
public class Recommend {
    int code;
    List<Integer> result;
}
