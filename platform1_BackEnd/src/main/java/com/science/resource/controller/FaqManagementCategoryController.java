package com.science.resource.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.science.resource.common.CommonResult;
import com.science.resource.entity.FaqManagementCategory;
import com.science.resource.entity.FaqManagementModel;
import com.science.resource.service.FaqManagementCategoryService;
import com.science.resource.service.FaqManagementModelService;
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
@RequestMapping("/resource/faqManagementCategory")
public class FaqManagementCategoryController {
    @Autowired
    FaqManagementCategoryService faqManagementCategoryService;
    @GetMapping("/list")
    public CommonResult faq_list(FaqManagementCategory faqManagementCategory){
        QueryWrapper<FaqManagementCategory> queryWrapper = new QueryWrapper<>();
        if(faqManagementCategory.getCategoryId()!=null){
            queryWrapper.eq("category_id",faqManagementCategory.getCategoryId());
        }
        if(faqManagementCategory.getAnswer()!=null){
            queryWrapper.like("answer",faqManagementCategory.getAnswer());
        }
        if(faqManagementCategory.getCreateTime()!=null){
            queryWrapper.eq("create_time",faqManagementCategory.getCreateTime());
        }
        if(faqManagementCategory.getName()!=null){
            queryWrapper.like("name",faqManagementCategory.getName());
        }

        return CommonResult.success(faqManagementCategoryService.list(queryWrapper));
    }
}

