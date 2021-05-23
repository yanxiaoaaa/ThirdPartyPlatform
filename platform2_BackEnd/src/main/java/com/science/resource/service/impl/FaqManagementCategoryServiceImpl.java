package com.science.resource.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.science.resource.entity.FaqManagementCategory;
import com.science.resource.mapper.FaqManagementCategoryMapper;
import com.science.resource.service.FaqManagementCategoryService;
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
public class FaqManagementCategoryServiceImpl extends ServiceImpl<FaqManagementCategoryMapper, FaqManagementCategory> implements FaqManagementCategoryService {

}
