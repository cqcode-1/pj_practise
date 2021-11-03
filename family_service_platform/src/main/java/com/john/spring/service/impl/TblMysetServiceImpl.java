package com.john.spring.service.impl;

import com.john.spring.entity.TblMyset;
import com.john.spring.dao.TblMysetMapper;
import com.john.spring.service.base.TblMysetService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 个人设置 服务实现类
 * </p>
 *
 * @author john
 * @since 2021-11-01
 */
@Service
public class TblMysetServiceImpl extends ServiceImpl<TblMysetMapper, TblMyset> implements TblMysetService {

}
