package com.john.spring.service.impl;

import com.john.spring.entity.TblSendLog;
import com.john.spring.dao.TblSendLogMapper;
import com.john.spring.service.base.TblSendLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 发送日志表 服务实现类
 * </p>
 *
 * @author john
 * @since 2021-11-01
 */
@Service
public class TblSendLogServiceImpl extends ServiceImpl<TblSendLogMapper, TblSendLog> implements TblSendLogService {

}
