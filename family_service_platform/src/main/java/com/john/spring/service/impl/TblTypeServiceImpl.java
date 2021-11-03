package com.john.spring.service.impl;

import com.john.spring.entity.TblType;
import com.john.spring.dao.TblTypeMapper;
import com.john.spring.service.base.TblTypeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 类型库 服务实现类
 * </p>
 *
 * @author john
 * @since 2021-11-01
 */
@Service
public class TblTypeServiceImpl extends ServiceImpl<TblTypeMapper, TblType> implements TblTypeService {

}
