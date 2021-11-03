package com.john.spring.service.impl;

import com.john.spring.entity.TblVod;
import com.john.spring.dao.TblVodMapper;
import com.john.spring.service.base.TblVodService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 视频点播 服务实现类
 * </p>
 *
 * @author john
 * @since 2021-11-01
 */
@Service
public class TblVodServiceImpl extends ServiceImpl<TblVodMapper, TblVod> implements TblVodService {

}
