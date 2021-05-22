package com.science.resource.VO;

import com.science.resource.VO.filter.Filter;
import com.science.resource.util.JsonConvert;
import lombok.Data;

import java.util.Arrays;
import java.util.List;

@Data
public class ListQuery {
    private int pageNum;
    private int pageSize;
    private String authorName;
    private String title;
    private String keyWord;
    private List<Filter> filters;

    public void setFilters(String filters) {
        if (filters== null)
            return;
        Filter[] filterArray =  JsonConvert.readValue(filters, Filter[].class);
        List<Filter> filterList = Arrays.asList(filterArray);
        this.filters = filterList;
    }
}
