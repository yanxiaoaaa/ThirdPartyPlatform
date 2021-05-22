package com.science.resource.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.science.resource.common.CommonResult;
import com.science.resource.common.PageData;
import com.science.resource.common.PageQuery;
import com.science.resource.entity.Equipment;
import com.science.resource.service.EquipmentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Minghao Shi
 * @since 2020-12-30
 */
@RestController
@Api(tags = "EquipmentController", description = "设备管理")
@RequestMapping("/resource/equipment")
public class EquipmentController {
    @Autowired
    EquipmentService equipmentService;
    @PostMapping("/add")
    public CommonResult equipmentAdd(@RequestBody Equipment equipment){
//        if (equipment.getBuydate()==null){
//            equipment.setBuydate();"\\{\\\u4ef6\\\u4ef6\\\u4ef6\\\u4ef6\\\u4ef6"
//        data:params
//        }

        return  CommonResult.success(equipmentService.save(equipment));
    }
    @ApiOperation(value = "设备列表")
    @GetMapping("/list")
    public CommonResult equipmentList(long current,long limit) {
        Page<Equipment> equipmentPage = new Page<>(current, limit);
//        equipmentService.page(equipmentPage,null);

//        long total = equipmentPage.getTotal();
//        List<Equipment> records = equipmentPage.getRecords();
        List<Equipment> records = new ArrayList();
        PageData<Equipment> pageData = new PageData(0, records);
        return CommonResult.success(pageData);
    }

    @GetMapping("/detail")
    public CommonResult equipmentDetail(long productID){

        return CommonResult.success(equipmentService.getById(productID));

    }
}

