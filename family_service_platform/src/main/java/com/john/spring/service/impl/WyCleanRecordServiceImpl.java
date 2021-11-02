package com.john.spring.service.impl;

import com.john.spring.entity.WyCleanRecord;
import com.john.spring.dao.WyCleanRecordMapper;
import com.john.spring.service.WyCleanRecordService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 清洁记录 服务实现类
 * </p>
 *
 * @author john
 * @since 2021-11-01
 */
@Service
public class WyCleanRecordServiceImpl extends ServiceImpl<WyCleanRecordMapper, WyCleanRecord> implements WyCleanRecordService {

}
