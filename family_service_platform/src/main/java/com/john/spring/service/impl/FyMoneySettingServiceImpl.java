package com.john.spring.service.impl;

import com.john.spring.entity.FyMoneySetting;
import com.john.spring.dao.FyMoneySettingMapper;
import com.john.spring.service.base.FyMoneySettingService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 费项设置 服务实现类
 * </p>
 *
 * @author john
 * @since 2021-11-01
 */
@Service
public class FyMoneySettingServiceImpl extends ServiceImpl<FyMoneySettingMapper, FyMoneySetting> implements FyMoneySettingService {

}
