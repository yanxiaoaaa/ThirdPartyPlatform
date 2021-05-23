package com.science.resource.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.science.resource.VO.HomePageData;
import com.science.resource.common.CommonResult;
import com.science.resource.entity.Company;
import com.science.resource.entity.Equipment;
import com.science.resource.entity.Expert;
import com.science.resource.service.CompanyService;
import com.science.resource.service.EquipmentService;
import com.science.resource.service.ExpertService;
import com.science.resource.service.RecommendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/resource/data")
public class DataController {
    @Autowired
    CompanyService companyService;

    @Autowired
    ExpertService expertService;

    @Autowired
    EquipmentService equipmentService;

    @Autowired
    RecommendService recommendService;

    @GetMapping("/homepage_data")
    public CommonResult  homePageGet(){
        HomePageData homePageData = new HomePageData();

        //热点或者推荐数据
        Page<Company> companyPage = new Page<>(1,8);
        companyService.page(companyPage,null);
        homePageData.setCompanies(companyPage.getRecords());
        homePageData.setCompanyNum(companyPage.getTotal());

        Page<Equipment> equipmentPage = new Page<>(1,8);
        equipmentService.page(equipmentPage,null);
        homePageData.setEquipmentList(equipmentPage.getRecords());
        homePageData.setEquipmentNum(equipmentPage.getTotal());

        Page<Expert> expertPage = new Page<>(1,9);
        expertService.page(expertPage,null);
        homePageData.setExperts(expertPage.getRecords());
        homePageData.setExpertNum(expertPage.getTotal());

        return CommonResult.success(homePageData);
    }
    @GetMapping("/recommend")
    public CommonResult recommend (){
       return CommonResult.success(recommendService.getRecommend(2,3,1));
    }
}
