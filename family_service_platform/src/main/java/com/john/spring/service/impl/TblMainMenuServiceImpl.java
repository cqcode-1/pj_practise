package com.john.spring.service.impl;

import com.john.spring.entity.TblMainMenu;
import com.john.spring.dao.TblMainMenuMapper;
import com.john.spring.service.TblMainMenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 主菜单 服务实现类
 * </p>
 *
 * @author john
 * @since 2021-11-01
 */
@Service
public class TblMainMenuServiceImpl extends ServiceImpl<TblMainMenuMapper, TblMainMenu> implements TblMainMenuService {

}
