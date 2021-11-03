package com.john.spring.service.impl;

import com.john.spring.entity.TblMessageSend;
import com.john.spring.dao.TblMessageSendMapper;
import com.john.spring.service.base.TblMessageSendService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 信息发送 服务实现类
 * </p>
 *
 * @author john
 * @since 2021-11-01
 */
@Service
public class TblMessageSendServiceImpl extends ServiceImpl<TblMessageSendMapper, TblMessageSend> implements TblMessageSendService {

}
