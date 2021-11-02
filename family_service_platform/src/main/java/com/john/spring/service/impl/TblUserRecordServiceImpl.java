package com.john.spring.service.impl;

import com.john.spring.entity.TblUserRecord;
import com.john.spring.dao.TblUserRecordMapper;
import com.john.spring.service.TblUserRecordService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户档案 服务实现类
 * </p>
 *
 * @author john
 * @since 2021-11-01
 */
@Service
public class TblUserRecordServiceImpl extends ServiceImpl<TblUserRecordMapper, TblUserRecord> implements TblUserRecordService {

}
