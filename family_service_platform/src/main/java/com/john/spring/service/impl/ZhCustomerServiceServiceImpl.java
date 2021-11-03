package com.john.spring.service.impl;

import com.john.spring.entity.ZhCustomerService;
import com.john.spring.dao.ZhCustomerServiceMapper;
import com.john.spring.service.base.ZhCustomerServiceService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 业主服务 服务实现类
 * </p>
 *
 * @author john
 * @since 2021-11-01
 */
@Service
public class ZhCustomerServiceServiceImpl extends ServiceImpl<ZhCustomerServiceMapper, ZhCustomerService> implements ZhCustomerServiceService {

}
