package com.science.resource.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.science.resource.common.CommonResult;
import com.science.resource.common.PageData;
import com.science.resource.entity.Equipment;
import com.science.resource.entity.PlatformInformation;
import com.science.resource.service.PlatformInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Minghao Shi
 * @since 2021-04-15
 */
@RestController
@RequestMapping("/resource/platformInformation")
public class PlatformInformationController {
    @Autowired
    PlatformInformationService platformInformationService;
    @PostMapping("/register")
    public CommonResult platformRegister(@RequestBody PlatformInformation platformInformation){
        Date date=new Date();
        platformInformation.setRegistrationTime(date);
        return CommonResult.success( platformInformationService.save(platformInformation));
    }

    @RequestMapping(value = "/listAll",method = RequestMethod.GET)
    public CommonResult platformList(){
        return CommonResult.success(platformInformationService.list());
    }

    @GetMapping("/list")
    public CommonResult platformList(long current,long limit){
        Page<PlatformInformation> platformtPage = new Page<>(current,limit);
        platformInformationService.page(platformtPage,null);

        long total = platformtPage.getTotal();
        List<PlatformInformation> records = platformtPage.getRecords();
        PageData<PlatformInformation> pageData = new PageData(total,records);
        return CommonResult.success(pageData);
    }

    @GetMapping("/detail")
    public CommonResult platformDetail(long productID){

        return CommonResult.success(platformInformationService.getById(productID));

    }

}

