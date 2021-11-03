package com.john.spring.service.impl;

import com.john.spring.entity.FcCell;
import com.john.spring.dao.FcCellMapper;
import com.john.spring.service.base.FcCellService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 房间信息表 服务实现类
 * </p>
 *
 * @author john
 * @since 2021-11-01
 */
@Service
public class FcCellServiceImpl extends ServiceImpl<FcCellMapper, FcCell> implements FcCellService {

}
