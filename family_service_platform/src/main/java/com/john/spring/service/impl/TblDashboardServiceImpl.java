package com.john.spring.service.impl;

import com.john.spring.entity.TblDashboard;
import com.john.spring.dao.TblDashboardMapper;
import com.john.spring.service.base.TblDashboardService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 仪表盘 服务实现类
 * </p>
 *
 * @author john
 * @since 2021-11-01
 */
@Service
public class TblDashboardServiceImpl extends ServiceImpl<TblDashboardMapper, TblDashboard> implements TblDashboardService {

}
