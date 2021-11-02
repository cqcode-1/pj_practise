package com.john.spring.service.impl;

import com.john.spring.entity.TblEmailSend;
import com.john.spring.dao.TblEmailSendMapper;
import com.john.spring.service.TblEmailSendService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 邮件发送 服务实现类
 * </p>
 *
 * @author john
 * @since 2021-11-01
 */
@Service
public class TblEmailSendServiceImpl extends ServiceImpl<TblEmailSendMapper, TblEmailSend> implements TblEmailSendService {

}
