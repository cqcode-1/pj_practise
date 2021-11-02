package com.john.spring.service.impl;

import com.john.spring.entity.TblAnswerData;
import com.john.spring.dao.TblAnswerDataMapper;
import com.john.spring.service.TblAnswerDataService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 题目可选答案信息表 服务实现类
 * </p>
 *
 * @author john
 * @since 2021-11-01
 */
@Service
public class TblAnswerDataServiceImpl extends ServiceImpl<TblAnswerDataMapper, TblAnswerData> implements TblAnswerDataService {

}
