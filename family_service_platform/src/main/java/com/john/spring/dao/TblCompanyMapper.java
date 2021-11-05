package com.john.spring.dao;

import com.john.spring.entity.TblCompany;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * <p>
 * 企业档案 Mapper 接口
 * </p>
 *
 * @author john
 * @since 2021-11-01
 */
@Component
public interface TblCompanyMapper extends BaseMapper<TblCompany> {

    List<TblCompany> queryCompany();
}
