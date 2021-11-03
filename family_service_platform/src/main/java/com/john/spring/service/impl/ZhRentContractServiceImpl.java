package com.john.spring.service.impl;

import com.john.spring.entity.ZhRentContract;
import com.john.spring.dao.ZhRentContractMapper;
import com.john.spring.service.base.ZhRentContractService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 租赁合同 服务实现类
 * </p>
 *
 * @author john
 * @since 2021-11-01
 */
@Service
public class ZhRentContractServiceImpl extends ServiceImpl<ZhRentContractMapper, ZhRentContract> implements ZhRentContractService {

}
