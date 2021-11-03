package com.john.spring.service.impl;

import com.john.spring.entity.TblEnvirSetting;
import com.john.spring.dao.TblEnvirSettingMapper;
import com.john.spring.service.base.TblEnvirSettingService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 环境配置 服务实现类
 * </p>
 *
 * @author john
 * @since 2021-11-01
 */
@Service
public class TblEnvirSettingServiceImpl extends ServiceImpl<TblEnvirSettingMapper, TblEnvirSetting> implements TblEnvirSettingService {

}
