package com.john.spring.service.impl;

import com.john.spring.entity.FyPublicBoxUser;
import com.john.spring.dao.FyPublicBoxUserMapper;
import com.john.spring.service.FyPublicBoxUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 公表关联用户 服务实现类
 * </p>
 *
 * @author john
 * @since 2021-11-01
 */
@Service
public class FyPublicBoxUserServiceImpl extends ServiceImpl<FyPublicBoxUserMapper, FyPublicBoxUser> implements FyPublicBoxUserService {

}
