package com.john.spring.service.impl;

import com.john.spring.entity.TblDept;
import com.john.spring.dao.TblDeptMapper;
import com.john.spring.service.TblDeptService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 部门信息表 服务实现类
 * </p>
 *
 * @author john
 * @since 2021-11-01
 */
@Service
public class TblDeptServiceImpl extends ServiceImpl<TblDeptMapper, TblDept> implements TblDeptService {

}
