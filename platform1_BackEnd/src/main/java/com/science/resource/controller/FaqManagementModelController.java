package com.science.resource.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.science.resource.common.CommonResult;
import com.science.resource.entity.FaqManagementModel;
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
 * @since 2021-02-23
 */
@RestController
@RequestMapping("/resource/faqManagementModel")
public class FaqManagementModelController {
    @Autowired
    FaqManagementModelService faqManagementModelService;
    @GetMapping("/list")
    public CommonResult faq_list(FaqManagementModel faqManagementModel){
        QueryWrapper<FaqManagementModel> queryWrapper = new QueryWrapper<>();
        System.out.println(faqManagementModel.toString());
        if(faqManagementModel.getCategoryNum()!=null){
            queryWrapper.eq("category_num",faqManagementModel.getCategoryNum());
        }
        if(faqManagementModel.getComment()!=null){
            queryWrapper.like("comment",faqManagementModel.getComment());
        }
        if(faqManagementModel.getDomain()!=null){
            queryWrapper.eq("domain",faqManagementModel.getDomain());
        }
        if(faqManagementModel.getCreateTime()!=null){
            queryWrapper.eq("create_time",faqManagementModel.getCreateTime());
        }
        if(faqManagementModel.getDataPath()!=null){
            queryWrapper.eq("data_path",faqManagementModel.getDataPath());
        }
        if(faqManagementModel.getName()!=null){
            queryWrapper.like("name",faqManagementModel.getName());
        }
        if(faqManagementModel.getRecordId()!=null){
            queryWrapper.eq("record_id",faqManagementModel.getRecordId());
        }
        if(faqManagementModel.getState()!=null){
            queryWrapper.eq("state",faqManagementModel.getState());
        }
        return CommonResult.success(faqManagementModelService.list(queryWrapper));
    }
}

