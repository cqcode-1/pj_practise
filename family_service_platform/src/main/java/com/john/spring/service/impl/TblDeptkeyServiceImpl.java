package com.john.spring.service.impl;

import com.john.spring.entity.TblDeptkey;
import com.john.spring.dao.TblDeptkeyMapper;
import com.john.spring.service.base.TblDeptkeyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 部门key 服务实现类
 * </p>
 *
 * @author john
 * @since 2021-11-01
 */
@Service
public class TblDeptkeyServiceImpl extends ServiceImpl<TblDeptkeyMapper, TblDeptkey> implements TblDeptkeyService {

}
