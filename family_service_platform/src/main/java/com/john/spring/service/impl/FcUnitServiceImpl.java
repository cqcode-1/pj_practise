package com.john.spring.service.impl;

import com.john.spring.entity.FcUnit;
import com.john.spring.dao.FcUnitMapper;
import com.john.spring.service.FcUnitService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 单元信息表 服务实现类
 * </p>
 *
 * @author john
 * @since 2021-11-01
 */
@Service
public class FcUnitServiceImpl extends ServiceImpl<FcUnitMapper, FcUnit> implements FcUnitService {

}
