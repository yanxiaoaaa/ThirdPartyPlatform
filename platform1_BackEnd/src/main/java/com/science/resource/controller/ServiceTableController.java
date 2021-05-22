package com.science.resource.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.science.resource.common.CommonResult;
import com.science.resource.common.PageData;
import com.science.resource.entity.DialogData;
import com.science.resource.entity.Equipment;
import com.science.resource.entity.Server;
import com.science.resource.entity.ServiceTable;
import com.science.resource.service.ServerService;
import com.science.resource.service.ServiceTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Minghao Shi
 * @since 2021-04-14
 */
@RestController
@RequestMapping("/resource/serviceTable")
public class ServiceTableController {
    @Autowired
    ServiceTableService serviceTableService;

    @Autowired
    ServerService serverService;
    @PostMapping("/register")
    public CommonResult register(@RequestBody ServiceTable serviceTable){
        Date date=new Date(System.currentTimeMillis());
        serviceTable.setCreateTime(date);
        return CommonResult.success(serviceTableService.save(serviceTable));
    }

    @GetMapping("/list")
    public CommonResult equipmentList(long current, long limit,@RequestParam(required = false) String category){
        QueryWrapper<ServiceTable> queryWrapper = new QueryWrapper<>();

        if (category!=null && !"".equals(category)){
            queryWrapper.eq("service_category",category);
            System.out.println(category);
        }
        Page<ServiceTable> serviceTablePage = new Page<>(current,limit);
        serviceTableService.page(serviceTablePage,queryWrapper);
        long total = serviceTablePage.getTotal();
        List<ServiceTable> records = serviceTablePage.getRecords();
        PageData<ServiceTable> pageData = new PageData(total,records);
        return CommonResult.success(pageData);
    }
    @GetMapping("/order_server_list")
    public CommonResult serviceTabbleList(){

        ServiceTable serviceTableList = serviceTableService.getOne(new QueryWrapper<ServiceTable>().eq("service_id",1));
        List<Integer> serIds = serviceTableList.getServerId();
        List<Server> servers = serverService.list(new QueryWrapper<Server>().in("id",serIds));
//        JSONArray.parse(serIds);
        return CommonResult.success(servers);
    }
    @GetMapping("/detail")
    public CommonResult equipmentDetail(long productID){
        return CommonResult.success(serviceTableService.getById(productID));
    }

    @GetMapping("/user_service")
    public CommonResult serviceDetail(@RequestParam long userId){
        Map<String,Object> map=new HashMap<>();
        map.put("server_id",userId);
        return CommonResult.success(serviceTableService.listByMap(map));
    }

    @GetMapping("/server_list")
    public CommonResult serviceDetail(){
        return CommonResult.success(serviceTableService.list());
    }
}

