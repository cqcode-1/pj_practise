package com.john.spring.service.impl;

import com.john.spring.entity.WyEmailReceive;
import com.john.spring.dao.WyEmailReceiveMapper;
import com.john.spring.service.WyEmailReceiveService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 信件收取 服务实现类
 * </p>
 *
 * @author john
 * @since 2021-11-01
 */
@Service
public class WyEmailReceiveServiceImpl extends ServiceImpl<WyEmailReceiveMapper, WyEmailReceive> implements WyEmailReceiveService {

}
