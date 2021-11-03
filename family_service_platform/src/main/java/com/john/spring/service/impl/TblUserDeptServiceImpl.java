package com.john.spring.service.impl;

import com.john.spring.entity.TblUserDept;
import com.john.spring.dao.TblUserDeptMapper;
import com.john.spring.service.base.TblUserDeptService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户部门表 服务实现类
 * </p>
 *
 * @author john
 * @since 2021-11-01
 */
@Service
public class TblUserDeptServiceImpl extends ServiceImpl<TblUserDeptMapper, TblUserDept> implements TblUserDeptService {

}
