package com.john.spring.dao;

import com.john.spring.entity.TblUserRecord;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 用户档案 Mapper 接口
 * </p>
 *
 * @author john
 * @since 2021-11-01
 */
@Component
public interface TblUserRecordMapper extends BaseMapper<TblUserRecord> {

    TblUserRecord selectUser(@Param("username") String username, @Param("password") String password);
}
