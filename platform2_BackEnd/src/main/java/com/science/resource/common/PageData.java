package com.science.resource.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageData<T> {
    private long total;
    private List<T> records;
//    private int current;
//    private int limit;
}
