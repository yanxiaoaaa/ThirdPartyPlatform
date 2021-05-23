package com.science.resource.service.impl;

import com.science.resource.entity.Patent;
import com.science.resource.mapper.PatentMapper;
import com.science.resource.service.PatentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Minghao Shi
 * @since 2021-04-25
 */
@Service
public class PatentServiceImpl extends ServiceImpl<PatentMapper, Patent> implements PatentService {

}
