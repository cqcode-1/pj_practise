package com.john.spring.service.impl;

import com.john.spring.entity.TblEmailReceive;
import com.john.spring.dao.TblEmailReceiveMapper;
import com.john.spring.service.TblEmailReceiveService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 邮件接受 服务实现类
 * </p>
 *
 * @author john
 * @since 2021-11-01
 */
@Service
public class TblEmailReceiveServiceImpl extends ServiceImpl<TblEmailReceiveMapper, TblEmailReceive> implements TblEmailReceiveService {

}
