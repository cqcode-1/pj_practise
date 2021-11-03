package com.john.spring.service.impl;

import com.john.spring.entity.TblMyplan;
import com.john.spring.dao.TblMyplanMapper;
import com.john.spring.service.base.TblMyplanService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 我的日程 服务实现类
 * </p>
 *
 * @author john
 * @since 2021-11-01
 */
@Service
public class TblMyplanServiceImpl extends ServiceImpl<TblMyplanMapper, TblMyplan> implements TblMyplanService {

}
