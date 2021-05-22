package com.science.resource.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.science.resource.VO.FileInfo;
import com.science.resource.VO.OrderShow;
import com.science.resource.entity.ServiceOrder;
import com.science.resource.mapper.ServerMapper;
import com.science.resource.mapper.ServiceOrderMapper;
import com.science.resource.mapper.ServiceTableMapper;
import com.science.resource.service.ServiceOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.swagger.models.auth.In;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Minghao Shi
 * @since 2021-03-29
 */
@Service
public class ServiceOrderServiceImpl extends ServiceImpl<ServiceOrderMapper, ServiceOrder> implements ServiceOrderService {
    @Autowired
    ServiceOrderMapper serviceOrderMapper;
    @Autowired
    ServiceTableMapper serviceTableMapper;
    @Autowired
    ServerMapper serverMapper;

    @Override
    public List<OrderShow> getSerOrderShow(Integer isDone, Integer server_id) {
        List<OrderShow> orderShows=null;

        if(isDone == 0){
            orderShows = new ArrayList<>();
            List<OrderShow> temp = serviceOrderMapper.getSerUndoOrderShow(server_id);
            System.out.println(temp);

            for (OrderShow orderShow : temp){
                if (orderShow.getServerId().contains(Integer.toString(server_id))){
                    orderShows.add(orderShow);
                }
            }
        }
        else{
            orderShows = new ArrayList<>();
            List<OrderShow> temp  = serviceOrderMapper.getSerDoneOrderShow(server_id);
            System.out.println(temp);
            for (OrderShow orderShow : temp){
                if (orderShow.getServerId().contains(Integer.toString(server_id))){
                    orderShows.add(orderShow);
                }
            }
        }
        return orderShows;
    }
    @Override
    public List<OrderShow> getCustOrderShow(Integer isDone,Integer customer_id) {
        List<OrderShow> orderShows=null;
        if(isDone == 0){
            orderShows = serviceOrderMapper.getCustUndoOrderShow(customer_id);
        }
        else{
            orderShows = serviceOrderMapper.getCustDoneOrderShow(customer_id);
        }
        return orderShows;
    }
    @Override
    public ServiceOrder updateState(Integer order_id,Integer state){
        serviceOrderMapper.updateState(order_id, state);
        return serviceOrderMapper.selectById(order_id);
    }

    @Override
    public ServiceOrder sCommuniCommend(Integer order_id, Integer rate, String text){
        serviceOrderMapper.sCommuniCommend(order_id, rate, text);
        return serviceOrderMapper.selectById(order_id);
    }

    @Override
    public ServiceOrder cCommuniCommend(Integer order_id, Integer rate, String text){
        serviceOrderMapper.cCommuniCommend(order_id, rate, text);
        return serviceOrderMapper.selectById(order_id);
    }

    @Override
    public ServiceOrder sComment(Integer order_id, Integer comment, Integer feel){
        serviceOrderMapper.sComment(order_id, comment, feel);
        return serviceOrderMapper.selectById(order_id);
    }

    @Override
    public ServiceOrder cCheck(Integer order_id, Integer comple, Integer punct){
        serviceOrderMapper.cCheck(order_id,comple,punct);
        return serviceOrderMapper.selectById(order_id);
    }

    @Override
    public ServiceOrder cComment(Integer order_id, Integer comment, Integer prof, Integer speed, Integer exper, Integer feel, String text){
        serviceOrderMapper.cComment(order_id,comment,prof,speed,exper,feel,text);
        return serviceOrderMapper.selectById(order_id);
    }

    @Override
    public boolean isCommuni(Integer order_id){
        return serviceOrderMapper.isCommuni(order_id);
    }

    @Override
    public boolean isComment(Integer order_id){
        return serviceOrderMapper.isComment(order_id);
    }

    @Override
    public void protocal(Integer order_id,String fileList) {
        serviceOrderMapper.protocal(order_id, fileList);
    }
    @Override
    public ServiceOrder done(Integer order_id){
        serviceOrderMapper.done(order_id);
        return serviceOrderMapper.selectById(order_id);
    }

    @Override
    public ServiceOrder cancle(Integer order_id){
        serviceOrderMapper.cancle(order_id);
        return serviceOrderMapper.selectById(order_id);
    }

}
