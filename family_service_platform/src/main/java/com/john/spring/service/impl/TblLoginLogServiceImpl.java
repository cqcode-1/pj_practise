package com.john.spring.service.impl;

import com.john.spring.entity.TblLoginLog;
import com.john.spring.dao.TblLoginLogMapper;
import com.john.spring.service.TblLoginLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 登录日志 服务实现类
 * </p>
 *
 * @author john
 * @since 2021-11-01
 */
@Service
public class TblLoginLogServiceImpl extends ServiceImpl<TblLoginLogMapper, TblLoginLog> implements TblLoginLogService {

}
