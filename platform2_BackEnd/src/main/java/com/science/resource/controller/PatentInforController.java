package com.science.resource.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.science.resource.common.CommonResult;
import com.science.resource.common.PageData;
import com.science.resource.entity.Expert;
import com.science.resource.entity.PatentInfor;
import com.science.resource.service.PatentInforService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Minghao Shi
 * @since 2021-04-16
 */
@RestController
@RequestMapping("/resource/patentInfor")
public class PatentInforController {
    @Autowired
    PatentInforService patentInforService;
    @GetMapping("/list")
    public CommonResult patentList(long current, long limit){
        Page<PatentInfor> equipmentPage = new Page<>(current,limit);
        QueryWrapper<PatentInfor> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("lang","CN");
        patentInforService.page(equipmentPage,queryWrapper);
        long total = equipmentPage.getTotal();
        List<PatentInfor> records = equipmentPage.getRecords();
        PageData<PatentInfor> pageData = new PageData(total,records);
        return CommonResult.success(pageData);
    }
}

