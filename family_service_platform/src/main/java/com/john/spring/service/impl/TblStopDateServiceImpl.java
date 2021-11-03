package com.john.spring.service.impl;

import com.john.spring.entity.TblStopDate;
import com.john.spring.dao.TblStopDateMapper;
import com.john.spring.service.base.TblStopDateService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 到期日期 服务实现类
 * </p>
 *
 * @author john
 * @since 2021-11-01
 */
@Service
public class TblStopDateServiceImpl extends ServiceImpl<TblStopDateMapper, TblStopDate> implements TblStopDateService {

}
