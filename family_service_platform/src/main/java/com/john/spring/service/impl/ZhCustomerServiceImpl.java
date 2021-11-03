package com.john.spring.service.impl;

import com.john.spring.entity.ZhCustomer;
import com.john.spring.dao.ZhCustomerMapper;
import com.john.spring.service.base.ZhCustomerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 业主信息表 服务实现类
 * </p>
 *
 * @author john
 * @since 2021-11-01
 */
@Service
public class ZhCustomerServiceImpl extends ServiceImpl<ZhCustomerMapper, ZhCustomer> implements ZhCustomerService {

}
