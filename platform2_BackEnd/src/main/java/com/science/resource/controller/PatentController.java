package com.science.resource.controller;


import com.science.resource.common.CommonResult;
import com.science.resource.service.PatentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Minghao Shi
 * @since 2021-04-25
 */
@RestController
@RequestMapping("/resource/patent")
public class PatentController {
    @Autowired
    PatentService patentService;

    @GetMapping("/detail")
    public CommonResult detail(@RequestParam long productID){


        return CommonResult.success(patentService.getById(productID));
    }

}

