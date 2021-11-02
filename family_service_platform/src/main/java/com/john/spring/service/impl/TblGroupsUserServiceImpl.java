package com.john.spring.service.impl;

import com.john.spring.entity.TblGroupsUser;
import com.john.spring.dao.TblGroupsUserMapper;
import com.john.spring.service.TblGroupsUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 分组用户 服务实现类
 * </p>
 *
 * @author john
 * @since 2021-11-01
 */
@Service
public class TblGroupsUserServiceImpl extends ServiceImpl<TblGroupsUserMapper, TblGroupsUser> implements TblGroupsUserService {

}
