package com.john.spring.service.impl;

import com.john.spring.entity.TblCompany;
import com.john.spring.dao.TblCompanyMapper;
import com.john.spring.service.TblCompanyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 企业档案 服务实现类
 * </p>
 *
 * @author john
 * @since 2021-11-01
 */
@Service
public class TblCompanyServiceImpl extends ServiceImpl<TblCompanyMapper, TblCompany> implements TblCompanyService {

}
