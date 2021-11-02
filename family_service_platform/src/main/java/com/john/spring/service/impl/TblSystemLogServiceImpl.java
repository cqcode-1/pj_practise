package com.john.spring.service.impl;

import com.john.spring.entity.TblSystemLog;
import com.john.spring.dao.TblSystemLogMapper;
import com.john.spring.service.TblSystemLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统日志 服务实现类
 * </p>
 *
 * @author john
 * @since 2021-11-01
 */
@Service
public class TblSystemLogServiceImpl extends ServiceImpl<TblSystemLogMapper, TblSystemLog> implements TblSystemLogService {

}
