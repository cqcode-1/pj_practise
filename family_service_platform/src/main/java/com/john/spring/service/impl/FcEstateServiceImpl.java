package com.john.spring.service.impl;

import com.john.spring.entity.FcEstate;
import com.john.spring.dao.FcEstateMapper;
import com.john.spring.service.FcEstateService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 楼盘信息 服务实现类
 * </p>
 *
 * @author john
 * @since 2021-11-01
 */
@Service
public class FcEstateServiceImpl extends ServiceImpl<FcEstateMapper, FcEstate> implements FcEstateService {

}
