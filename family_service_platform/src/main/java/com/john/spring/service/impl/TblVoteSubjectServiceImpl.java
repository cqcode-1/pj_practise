package com.john.spring.service.impl;

import com.john.spring.entity.TblVoteSubject;
import com.john.spring.dao.TblVoteSubjectMapper;
import com.john.spring.service.base.TblVoteSubjectService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 投票题目表 服务实现类
 * </p>
 *
 * @author john
 * @since 2021-11-01
 */
@Service
public class TblVoteSubjectServiceImpl extends ServiceImpl<TblVoteSubjectMapper, TblVoteSubject> implements TblVoteSubjectService {

}
