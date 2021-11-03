package com.john.spring.service.impl;

import com.john.spring.entity.TblPositionRecord;
import com.john.spring.dao.TblPositionRecordMapper;
import com.john.spring.service.base.TblPositionRecordService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 职位档案 服务实现类
 * </p>
 *
 * @author john
 * @since 2021-11-01
 */
@Service
public class TblPositionRecordServiceImpl extends ServiceImpl<TblPositionRecordMapper, TblPositionRecord> implements TblPositionRecordService {

}
