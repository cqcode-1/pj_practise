package com.john.spring.service.impl;

import com.john.spring.entity.WyCommitteeMembers;
import com.john.spring.dao.WyCommitteeMembersMapper;
import com.john.spring.service.base.WyCommitteeMembersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 业委会成员 服务实现类
 * </p>
 *
 * @author john
 * @since 2021-11-01
 */
@Service
public class WyCommitteeMembersServiceImpl extends ServiceImpl<WyCommitteeMembersMapper, WyCommitteeMembers> implements WyCommitteeMembersService {

}
