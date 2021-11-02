package com.john.spring.service.impl;

import com.john.spring.entity.TblColor;
import com.john.spring.dao.TblColorMapper;
import com.john.spring.service.TblColorService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 颜色管理 服务实现类
 * </p>
 *
 * @author john
 * @since 2021-11-01
 */
@Service
public class TblColorServiceImpl extends ServiceImpl<TblColorMapper, TblColor> implements TblColorService {

}
