package com.john.spring.service.impl;

import com.john.spring.entity.FySaleContract;
import com.john.spring.dao.FySaleContractMapper;
import com.john.spring.service.FySaleContractService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 销售合同 服务实现类
 * </p>
 *
 * @author john
 * @since 2021-11-01
 */
@Service
public class FySaleContractServiceImpl extends ServiceImpl<FySaleContractMapper, FySaleContract> implements FySaleContractService {

}
