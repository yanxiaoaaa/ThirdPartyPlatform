package com.science.resource.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.science.resource.entity.FaqManagementQuery;
import com.science.resource.mapper.FaqManagementQueryMapper;
import com.science.resource.service.FaqManagementQueryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Minghao Shi
 * @since 2021-03-03
 */
@Service
@DS("faqDB")
public class FaqManagementQueryServiceImpl extends ServiceImpl<FaqManagementQueryMapper, FaqManagementQuery> implements FaqManagementQueryService {

}
