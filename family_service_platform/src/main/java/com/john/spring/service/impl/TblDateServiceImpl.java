package com.john.spring.service.impl;

import com.john.spring.entity.TblDate;
import com.john.spring.dao.TblDateMapper;
import com.john.spring.service.base.TblDateService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 工作日期 服务实现类
 * </p>
 *
 * @author john
 * @since 2021-11-01
 */
@Service
public class TblDateServiceImpl extends ServiceImpl<TblDateMapper, TblDate> implements TblDateService {

}
