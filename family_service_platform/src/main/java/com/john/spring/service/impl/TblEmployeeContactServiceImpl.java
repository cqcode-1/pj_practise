package com.john.spring.service.impl;

import com.john.spring.entity.TblEmployeeContact;
import com.john.spring.dao.TblEmployeeContactMapper;
import com.john.spring.service.TblEmployeeContactService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 员工通讯录 服务实现类
 * </p>
 *
 * @author john
 * @since 2021-11-01
 */
@Service
public class TblEmployeeContactServiceImpl extends ServiceImpl<TblEmployeeContactMapper, TblEmployeeContact> implements TblEmployeeContactService {

}
