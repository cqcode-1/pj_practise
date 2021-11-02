package com.john.spring.service.impl;

import com.john.spring.entity.TblVoteData;
import com.john.spring.dao.TblVoteDataMapper;
import com.john.spring.service.TblVoteDataService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 投票数据表 服务实现类
 * </p>
 *
 * @author john
 * @since 2021-11-01
 */
@Service
public class TblVoteDataServiceImpl extends ServiceImpl<TblVoteDataMapper, TblVoteData> implements TblVoteDataService {

}
