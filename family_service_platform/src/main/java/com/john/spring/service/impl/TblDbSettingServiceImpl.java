package com.john.spring.service.impl;

import com.john.spring.entity.TblDbSetting;
import com.john.spring.dao.TblDbSettingMapper;
import com.john.spring.service.TblDbSettingService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 数据库设置 服务实现类
 * </p>
 *
 * @author john
 * @since 2021-11-01
 */
@Service
public class TblDbSettingServiceImpl extends ServiceImpl<TblDbSettingMapper, TblDbSetting> implements TblDbSettingService {

}
