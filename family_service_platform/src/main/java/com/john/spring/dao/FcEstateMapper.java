package com.john.spring.dao;

import com.john.spring.entity.FcEstate;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 楼盘信息 Mapper 接口
 * </p>
 *
 * @author john
 * @since 2021-11-01
 */
@Component
public interface FcEstateMapper extends BaseMapper<FcEstate> {


    Integer insertOne(FcEstate fcEstate);
}
