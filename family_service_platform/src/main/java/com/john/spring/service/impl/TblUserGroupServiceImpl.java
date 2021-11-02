package com.john.spring.service.impl;

import com.john.spring.entity.TblUserGroup;
import com.john.spring.dao.TblUserGroupMapper;
import com.john.spring.service.TblUserGroupService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户分组 服务实现类
 * </p>
 *
 * @author john
 * @since 2021-11-01
 */
@Service
public class TblUserGroupServiceImpl extends ServiceImpl<TblUserGroupMapper, TblUserGroup> implements TblUserGroupService {

}
