package com.science.resource.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.science.resource.common.CommonResult;
import com.science.resource.common.PageData;
import com.science.resource.entity.DialogData;
import com.science.resource.entity.Equipment;
import com.science.resource.service.DialogDataService;
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
 * @since 2021-02-03
 */
@RestController
@RequestMapping("/resource/dialogData")
public class DialogDataController {
    @Autowired
    DialogDataService dialogDataService;

    @GetMapping("/list")
    public CommonResult dialogList(long current,long pageSize){
        Page<DialogData> dialogDataPage = new Page<>(current,pageSize);

        dialogDataService.page(dialogDataPage,null);

        long total = dialogDataPage.getTotal();
        List<DialogData> records = dialogDataPage.getRecords();
        return CommonResult.success(records);
    }


}

