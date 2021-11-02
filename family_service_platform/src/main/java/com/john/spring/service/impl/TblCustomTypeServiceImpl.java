package com.john.spring.service.impl;

import com.john.spring.entity.TblCustomType;
import com.john.spring.dao.TblCustomTypeMapper;
import com.john.spring.service.TblCustomTypeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 自定义类型 服务实现类
 * </p>
 *
 * @author john
 * @since 2021-11-01
 */
@Service
public class TblCustomTypeServiceImpl extends ServiceImpl<TblCustomTypeMapper, TblCustomType> implements TblCustomTypeService {

}
