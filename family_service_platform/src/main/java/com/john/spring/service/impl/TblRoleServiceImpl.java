package com.john.spring.service.impl;

import com.john.spring.entity.TblRole;
import com.john.spring.dao.TblRoleMapper;
import com.john.spring.service.TblRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色档案 服务实现类
 * </p>
 *
 * @author john
 * @since 2021-11-01
 */
@Service
public class TblRoleServiceImpl extends ServiceImpl<TblRoleMapper, TblRole> implements TblRoleService {

}
