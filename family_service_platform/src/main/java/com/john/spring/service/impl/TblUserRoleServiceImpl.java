package com.john.spring.service.impl;

import com.john.spring.entity.TblUserRole;
import com.john.spring.dao.TblUserRoleMapper;
import com.john.spring.service.base.TblUserRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户角色表 服务实现类
 * </p>
 *
 * @author john
 * @since 2021-11-01
 */
@Service
public class TblUserRoleServiceImpl extends ServiceImpl<TblUserRoleMapper, TblUserRole> implements TblUserRoleService {

}
