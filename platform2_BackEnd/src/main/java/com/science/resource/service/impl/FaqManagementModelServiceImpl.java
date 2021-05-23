package com.science.resource.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.science.resource.entity.FaqManagementModel;
import com.science.resource.mapper.FaqManagementModelMapper;
import com.science.resource.service.FaqManagementModelService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Minghao Shi
 * @since 2021-02-23
 */
@Service
@DS("faqDB")
public class FaqManagementModelServiceImpl extends ServiceImpl<FaqManagementModelMapper, FaqManagementModel> implements FaqManagementModelService {

}
