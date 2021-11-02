package com.john.spring.service.impl;

import com.john.spring.entity.WyCommunityEvent;
import com.john.spring.dao.WyCommunityEventMapper;
import com.john.spring.service.WyCommunityEventService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 社区活动 服务实现类
 * </p>
 *
 * @author john
 * @since 2021-11-01
 */
@Service
public class WyCommunityEventServiceImpl extends ServiceImpl<WyCommunityEventMapper, WyCommunityEvent> implements WyCommunityEventService {

}
