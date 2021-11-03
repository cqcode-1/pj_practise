package com.john.spring.service.impl;

import com.john.spring.entity.TblWorkDate;
import com.john.spring.dao.TblWorkDateMapper;
import com.john.spring.service.base.TblWorkDateService;
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
public class TblWorkDateServiceImpl extends ServiceImpl<TblWorkDateMapper, TblWorkDate> implements TblWorkDateService {

}
