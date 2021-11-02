package com.john.spring.service.impl;

import com.john.spring.entity.ZhCustomerEstate;
import com.john.spring.dao.ZhCustomerEstateMapper;
import com.john.spring.service.ZhCustomerEstateService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 业主房产对照表 服务实现类
 * </p>
 *
 * @author john
 * @since 2021-11-01
 */
@Service
public class ZhCustomerEstateServiceImpl extends ServiceImpl<ZhCustomerEstateMapper, ZhCustomerEstate> implements ZhCustomerEstateService {

}
