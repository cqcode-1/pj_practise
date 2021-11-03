package com.john.spring.service.impl;

import com.john.spring.entity.TblMessageReceive;
import com.john.spring.dao.TblMessageReceiveMapper;
import com.john.spring.service.base.TblMessageReceiveService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 短信接受表 服务实现类
 * </p>
 *
 * @author john
 * @since 2021-11-01
 */
@Service
public class TblMessageReceiveServiceImpl extends ServiceImpl<TblMessageReceiveMapper, TblMessageReceive> implements TblMessageReceiveService {

}
