package com.john.spring.service.impl;

import com.john.spring.entity.FcBuilding;
import com.john.spring.dao.FcBuildingMapper;
import com.john.spring.service.FcBuildingService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 楼宇信息表 服务实现类
 * </p>
 *
 * @author john
 * @since 2021-11-01
 */
@Service
public class FcBuildingServiceImpl extends ServiceImpl<FcBuildingMapper, FcBuilding> implements FcBuildingService {

}
