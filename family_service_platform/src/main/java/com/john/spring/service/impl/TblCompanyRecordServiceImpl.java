package com.john.spring.service.impl;

import com.john.spring.entity.TblCompanyRecord;
import com.john.spring.dao.TblCompanyRecordMapper;
import com.john.spring.service.TblCompanyRecordService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 单位名录 服务实现类
 * </p>
 *
 * @author john
 * @since 2021-11-01
 */
@Service
public class TblCompanyRecordServiceImpl extends ServiceImpl<TblCompanyRecordMapper, TblCompanyRecord> implements TblCompanyRecordService {

}
