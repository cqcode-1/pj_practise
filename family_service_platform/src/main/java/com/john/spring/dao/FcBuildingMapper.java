package com.john.spring.dao;

import com.john.spring.entity.FcBuilding;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * <p>
 * 楼宇信息表 Mapper 接口
 * </p>
 *
 * @author john
 * @since 2021-11-01
 */
@Component
public interface FcBuildingMapper extends BaseMapper<FcBuilding> {

    Integer insertBatch(List<FcBuilding> list);
}
