package com.john.spring.service.impl;

import com.john.spring.entity.TblVoteDetail;
import com.john.spring.dao.TblVoteDetailMapper;
import com.john.spring.service.TblVoteDetailService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 投票数据明细表 服务实现类
 * </p>
 *
 * @author john
 * @since 2021-11-01
 */
@Service
public class TblVoteDetailServiceImpl extends ServiceImpl<TblVoteDetailMapper, TblVoteDetail> implements TblVoteDetailService {

}
