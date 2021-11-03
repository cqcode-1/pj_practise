package com.john.spring.service.impl;

import com.john.spring.entity.TblMessageCharge;
import com.john.spring.dao.TblMessageChargeMapper;
import com.john.spring.service.base.TblMessageChargeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 短信充值单 服务实现类
 * </p>
 *
 * @author john
 * @since 2021-11-01
 */
@Service
public class TblMessageChargeServiceImpl extends ServiceImpl<TblMessageChargeMapper, TblMessageCharge> implements TblMessageChargeService {

}
