package com.john.spring.service.impl;

import com.john.spring.entity.TblMyNote;
import com.john.spring.dao.TblMyNoteMapper;
import com.john.spring.service.TblMyNoteService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 我的记事本 服务实现类
 * </p>
 *
 * @author john
 * @since 2021-11-01
 */
@Service
public class TblMyNoteServiceImpl extends ServiceImpl<TblMyNoteMapper, TblMyNote> implements TblMyNoteService {

}
