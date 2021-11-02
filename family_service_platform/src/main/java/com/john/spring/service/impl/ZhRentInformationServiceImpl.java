package com.john.spring.service.impl;

import com.john.spring.entity.ZhRentInformation;
import com.john.spring.dao.ZhRentInformationMapper;
import com.john.spring.service.ZhRentInformationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 租户信息 服务实现类
 * </p>
 *
 * @author john
 * @since 2021-11-01
 */
@Service
public class ZhRentInformationServiceImpl extends ServiceImpl<ZhRentInformationMapper, ZhRentInformation> implements ZhRentInformationService {

}
