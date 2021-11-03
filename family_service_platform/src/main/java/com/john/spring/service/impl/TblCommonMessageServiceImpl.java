package com.john.spring.service.impl;

import com.john.spring.entity.TblCommonMessage;
import com.john.spring.dao.TblCommonMessageMapper;
import com.john.spring.service.base.TblCommonMessageService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 常用短信 服务实现类
 * </p>
 *
 * @author john
 * @since 2021-11-01
 */
@Service
public class TblCommonMessageServiceImpl extends ServiceImpl<TblCommonMessageMapper, TblCommonMessage> implements TblCommonMessageService {

}
