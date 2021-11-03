package com.john.spring.service.impl;

import com.john.spring.entity.TblDbbackup;
import com.john.spring.dao.TblDbbackupMapper;
import com.john.spring.service.base.TblDbbackupService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 数据库备份 服务实现类
 * </p>
 *
 * @author john
 * @since 2021-11-01
 */
@Service
public class TblDbbackupServiceImpl extends ServiceImpl<TblDbbackupMapper, TblDbbackup> implements TblDbbackupService {

}
