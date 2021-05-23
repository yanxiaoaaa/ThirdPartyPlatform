package com.science.resource.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.science.resource.VO.HomePageData;
import com.science.resource.common.CommonResult;
import com.science.resource.entity.Company;
import com.science.resource.entity.Equipment;
import com.science.resource.entity.Expert;
import com.science.resource.entity.PatentInfor;
import com.science.resource.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/resource")
public class ResourceController {
    @Autowired
    CompanyService companyService;

    @Autowired
    ExpertService expertService;

    @Autowired
    EquipmentService equipmentService;

    @Autowired
    PatentInforService patentInforService;
    @GetMapping("/resource_data")
    public CommonResult homePageGet(long current, long limit, @RequestParam(required = false) String category){
        HomePageData homePageData = new HomePageData();
        long size = limit/4;
        long fin = limit-size*3;
        //热点或者推荐数据
        Page<Company> companyPage = new Page<>(current,size);
        companyService.page(companyPage,null);
        homePageData.setCompanies(companyPage.getRecords());
        homePageData.setCompanyNum(companyPage.getSize());
        Page<Equipment> equipmentPage = new Page<>(current,size);
        equipmentService.page(equipmentPage,null);
        homePageData.setEquipmentList(equipmentPage.getRecords());
        homePageData.setEquipmentNum(equipmentPage.getSize());

        Page<Expert> expertPage = new Page<>(current,6);
        expertService.page(expertPage,null);
        homePageData.setExperts(expertPage.getRecords());
        homePageData.setExpertNum(expertPage.getSize());
        QueryWrapper<PatentInfor> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("lang","CN");
        Page<PatentInfor> patentInforPage = new Page<>(current,fin);
        patentInforService.page(patentInforPage,queryWrapper);
        homePageData.setPatentInfors(patentInforPage.getRecords());
        homePageData.setPatentInforNum(patentInforPage.getSize());
//        System.out.println(patentInforService.getById(1));
        return CommonResult.success(homePageData);
    }
}
