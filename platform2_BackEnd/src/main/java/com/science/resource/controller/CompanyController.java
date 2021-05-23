package com.science.resource.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.science.resource.common.CommonResult;
import com.science.resource.common.PageData;
import com.science.resource.entity.Company;
import com.science.resource.entity.Expert;
import com.science.resource.service.CompanyService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
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
@RequestMapping("/resource/company")
public class CompanyController {
    @Autowired
    CompanyService companyService;
    @GetMapping("/detail")
    public CommonResult companyDetail(long productID){

        return CommonResult.success(companyService.getById(productID));

    }
    @ApiOperation(value = "设备列表")
    @GetMapping("/list")
    public CommonResult equipmentList(long current,long limit){
        Page<Company> equipmentPage = new Page<>(current,limit);
        companyService.page(equipmentPage,null);
        long total = equipmentPage.getTotal();
        List<Company> records = equipmentPage.getRecords();
        PageData<Company> pageData = new PageData(total,records);
        return CommonResult.success(pageData);
    }
}

