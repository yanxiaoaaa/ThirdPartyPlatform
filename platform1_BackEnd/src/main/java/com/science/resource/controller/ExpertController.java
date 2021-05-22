package com.science.resource.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.science.resource.common.CommonResult;
import com.science.resource.common.PageData;
import com.science.resource.entity.Equipment;
import com.science.resource.entity.Expert;
import com.science.resource.service.CompanyService;
import com.science.resource.service.ExpertService;
import io.swagger.annotations.ApiOperation;
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
 * @since 2021-01-25
 */
@RestController
@RequestMapping("/resource/expert")
public class ExpertController {
    @Autowired
    ExpertService expertService;
    @GetMapping("/detail")
    public CommonResult companyDetail(long productID){

        return CommonResult.success(expertService.getById(productID));

    }
    @ApiOperation(value = "设备列表")
    @GetMapping("/list")
    public CommonResult equipmentList(long current,long limit){
        Page<Expert> equipmentPage = new Page<>(current,limit);
        expertService.page(equipmentPage,null);

        long total = equipmentPage.getTotal();
        List<Expert> records = equipmentPage.getRecords();
        PageData<Expert> pageData = new PageData(total,records);
        return CommonResult.success(pageData);
    }
}

