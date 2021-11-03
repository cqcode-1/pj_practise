package com.john.spring.service.impl;

import com.john.spring.entity.TblMydesk;
import com.john.spring.dao.TblMydeskMapper;
import com.john.spring.service.base.TblMydeskService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 我的桌面 服务实现类
 * </p>
 *
 * @author john
 * @since 2021-11-01
 */
@Service
public class TblMydeskServiceImpl extends ServiceImpl<TblMydeskMapper, TblMydesk> implements TblMydeskService {

}
