package com.science.resource.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.science.resource.common.CommonResult;
import com.science.resource.entity.FaqManagementCategory;
import com.science.resource.entity.FaqManagementQuery;
import com.science.resource.service.FaqManagementCategoryService;
import com.science.resource.service.FaqManagementQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Minghao Shi
 * @since 2021-03-03
 */
@RestController
@RequestMapping("/resource/faqManagementQuery")
public class FaqManagementQueryController {
    @Autowired
    FaqManagementQueryService faqManagementQueryService;
    @GetMapping("/list")
    public CommonResult faq_list(FaqManagementQuery faqManagementCategory){
        QueryWrapper<FaqManagementQuery> queryWrapper = new QueryWrapper<>();
        if(faqManagementCategory.getCategoryId()!=null){
            queryWrapper.eq("category_id",faqManagementCategory.getCategoryId());
        }
        if(faqManagementCategory.getQueryId()!=null){
            queryWrapper.eq("answer",faqManagementCategory.getQueryId());
        }
        if(faqManagementCategory.getCreateTime()!=null){
            queryWrapper.eq("create_time",faqManagementCategory.getCreateTime());
        }
        if(faqManagementCategory.getText()!=null){
            queryWrapper.like("name",faqManagementCategory.getText());
        }

        return CommonResult.success(faqManagementQueryService.list(queryWrapper));
    }
}

