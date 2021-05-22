package com.science.resource.controller;


import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.science.resource.VO.FileInfo;
import com.science.resource.VO.OrderShow;
import com.science.resource.VO.OrderState;
import com.science.resource.VO.UserToken;
import com.science.resource.common.CommonResult;
import com.science.resource.entity.FaqManagementCategory;
import com.science.resource.entity.ServiceOrder;
import com.science.resource.entity.Storage;
import com.science.resource.mapper.StorageMapper;
import com.science.resource.security.annotation.LoginUser;
import com.science.resource.service.ServerService;
import com.science.resource.service.ServiceOrderService;
import com.science.resource.service.StorageService;
import com.science.resource.util.JsonConvert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Minghao Shi
 * @since 2021-03-29
 */
@RestController
@RequestMapping("/resource/serviceOrder")
public class ServiceOrderController {
    @Autowired
    ServiceOrderService serviceOrderService;
    @Autowired
    ServerService serverService;
    @Autowired
    StorageService storageService;

    @PostMapping("/showOrders")
    public CommonResult Ordershow(@LoginUser UserToken usertoken,@RequestBody String str){
        Integer isDone = Integer.parseInt(JSON.parseObject(str).get("isDone").toString());
        Integer type = Integer.parseInt(JSON.parseObject(str).get("type").toString());
        List<OrderShow> orderShows= null;
        //System.out.println(isDone);
        if(type==0){
            Integer server_id = serverService.getServerId(usertoken.getUserId());
            orderShows = serviceOrderService.getSerOrderShow(isDone, server_id);
        }
        else if(type==1){
            Integer customer_id = usertoken.getUserId();
            orderShows = serviceOrderService.getCustOrderShow(isDone, customer_id);
        }
        return CommonResult.success(orderShows);
    }

    @PostMapping("/updateState")
    public CommonResult updateState(@RequestBody String str){
        Integer order_id = Integer.parseInt(JSON.parseObject(str).get("order_id").toString());
        Integer state = Integer.parseInt(JSON.parseObject(str).get("state").toString());
        serviceOrderService.updateState(order_id, state);
        return CommonResult.success("success");
    }
    @PostMapping("/sCommuniCommend")
    public CommonResult sCommuniCommend(@RequestBody String str){
        Integer order_id = Integer.parseInt(JSON.parseObject(str).get("order_id").toString());
        Integer state = Integer.parseInt(JSON.parseObject(str).get("state").toString());
        Integer rate = Integer.parseInt(JSON.parseObject(str).get("rate").toString());
        String text = JSON.parseObject(str).get("text").toString();
        ServiceOrder serviceOrder1 = serviceOrderService.sCommuniCommend(order_id, rate, text);
        ServiceOrder serviceOrder2=null;
        if(serviceOrderService.isCommuni(order_id)) {
           serviceOrder2 =  serviceOrderService.updateState(order_id, state + 1);
        }
        OrderState orderState = new OrderState(serviceOrder2 == null? state: serviceOrder2.getProcessId(), serviceOrder1.getCConversationCommentScore());
        return CommonResult.success(orderState);
    }

    @PostMapping("/cCommuniCommend")
    public CommonResult cCommuniCommend(@RequestBody String str){
        Integer order_id = Integer.parseInt(JSON.parseObject(str).get("order_id").toString());
        Integer state = Integer.parseInt(JSON.parseObject(str).get("state").toString());
        Integer rate = Integer.parseInt(JSON.parseObject(str).get("rate").toString());
        String text = JSON.parseObject(str).get("text").toString();
        ServiceOrder serviceOrder1 = serviceOrderService.cCommuniCommend(order_id, rate, text);
        ServiceOrder serviceOrder2=null;
        if(serviceOrderService.isCommuni(order_id)) {
            serviceOrder2 =  serviceOrderService.updateState(order_id, state + 1);
        }
        OrderState orderState = new OrderState(serviceOrder2 == null? state: serviceOrder2.getProcessId(), serviceOrder1.getCConversationCommentScore());
        return CommonResult.success(orderState);
    }

    @PostMapping("/sComment")
    public CommonResult sComment(@RequestBody String str){
        Integer order_id = Integer.parseInt(JSON.parseObject(str).get("order_id").toString());
        Integer state = Integer.parseInt(JSON.parseObject(str).get("state").toString());
        Integer comment = Integer.parseInt(JSON.parseObject(str).get("comment").toString());
        Integer feel = Integer.parseInt(JSON.parseObject(str).get("feel").toString());
        serviceOrderService.sComment(order_id, comment, feel);
        ServiceOrder serviceOrder=null;
        if(serviceOrderService.isComment(order_id)) {
            serviceOrder =  serviceOrderService.done(order_id);
        }
        return CommonResult.success(serviceOrder == null? state : serviceOrder.getIsDone());
    }
    @PostMapping("/cCheck")
    public CommonResult cCheck(@RequestBody String str){
        Integer order_id = Integer.parseInt(JSON.parseObject(str).get("order_id").toString());
        Integer state = Integer.parseInt(JSON.parseObject(str).get("state").toString());
        Integer comple = Integer.parseInt(JSON.parseObject(str).get("comple").toString());
        Integer punct = Integer.parseInt(JSON.parseObject(str).get("punct").toString());
        serviceOrderService.cCheck(order_id, comple, punct);
        serviceOrderService.updateState(order_id, state+1);
        return CommonResult.success("success");
    }
    @PostMapping("/cComment")
    public CommonResult cComment(@RequestBody String str){
        Integer order_id = Integer.parseInt(JSON.parseObject(str).get("order_id").toString());
        Integer state = Integer.parseInt(JSON.parseObject(str).get("state").toString());
        Integer comment = Integer.parseInt(JSON.parseObject(str).get("comment").toString());
        Integer prof = Integer.parseInt(JSON.parseObject(str).get("comment").toString());
        Integer speed = Integer.parseInt(JSON.parseObject(str).get("speed").toString());
        Integer exper = Integer.parseInt(JSON.parseObject(str).get("exper").toString());
        Integer feel = Integer.parseInt(JSON.parseObject(str).get("feel").toString());
        String text = JSON.parseObject(str).get("text").toString();
        serviceOrderService.cComment(order_id, comment,prof,speed,exper, feel, text);
        ServiceOrder serviceOrder=null;
        if(serviceOrderService.isComment(order_id)) {
            serviceOrder =  serviceOrderService.done(order_id);
        }
        return CommonResult.success(serviceOrder == null? state:serviceOrder.getIsDone());
    }

    @PostMapping("/uploadfile")
    public CommonResult Protocal(@RequestBody String str){
        Integer order_id = Integer.parseInt(JSON.parseObject(str).get("order_id").toString());
        Integer state = Integer.parseInt(JSON.parseObject(str).get("state").toString());
        Integer type = Integer.parseInt(JSON.parseObject(str).get("type").toString());
        String fileList = JsonConvert.toJSon(JSON.parseObject(str).get("data"));
        QueryWrapper<ServiceOrder> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("order_id",order_id);
       // System.out.println(type);
        if(type!=1) {
            if(type==0) {
                serviceOrderService.updateState(order_id, state);
                serviceOrderService.update(new ServiceOrder().setProtocal(fileList), queryWrapper);
            }
            else if(type==1){
                serviceOrderService.update(new ServiceOrder().setTraceFile(fileList), queryWrapper);
            }
            else if(type==2){
                serviceOrderService.update(new ServiceOrder().setResultFile(fileList), queryWrapper);
            }
        }
        return CommonResult.success("success");
    }

    @PostMapping("/getfile")
    public CommonResult getFile(@RequestBody String str) {
        Integer order_id = Integer.parseInt(JSON.parseObject(str).get("values").toString());
        Integer type = Integer.parseInt(JSON.parseObject(str).get("type").toString());
       // System.out.println(type);
        ServiceOrder serviceOrder = serviceOrderService.getById(order_id);
        List urlList = null;
        if(type==0) {
            urlList = JsonConvert.readValue(serviceOrder.getProtocal(), List.class);
           // System.out.println(urlList);
        }
        else if(type==1){
            urlList = JsonConvert.readValue(serviceOrder.getTraceFile(), List.class);
        }
        else if(type==2){
            urlList = JsonConvert.readValue(serviceOrder.getResultFile(), List.class);
        }
        List<Storage> fileList = null;
        if(urlList!=null) {
            fileList = storageService.getFileInfo(urlList);
        }
        return CommonResult.success(fileList);
    }
}

