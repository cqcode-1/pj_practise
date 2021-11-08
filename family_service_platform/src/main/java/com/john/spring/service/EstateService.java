package com.john.spring.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.john.spring.dao.FcEstateMapper;
import com.john.spring.dao.TblCompanyMapper;
import com.john.spring.entity.FcEstate;
import com.john.spring.entity.TblCompany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstateService {

   @Autowired
   private TblCompanyMapper tblCompanyMapper;

   @Autowired
   private FcEstateMapper fcEstateMapper;

   public List<TblCompany> queryCompany(){
      return tblCompanyMapper.queryCompany();
   }

   public Integer insertEstate(FcEstate fcEstate){
      final int insert = fcEstateMapper.insert(fcEstate);
      return insert;
   }

   public Integer insertOne(FcEstate fcEstate){
      return fcEstateMapper.insertOne(fcEstate);
   }

   /**
    * 插入信息
    * @param fcEstate
    * @return
    */
   public int insert(FcEstate fcEstate){
      final QueryWrapper<FcEstate> queryWrapper = new QueryWrapper<>();
      queryWrapper.eq("estate_code", fcEstate.getEstateCode());
      final FcEstate estate = fcEstateMapper.selectOne(queryWrapper);
      if(estate != null){
         return 0;
      }else{
         return fcEstateMapper.insert(fcEstate);
      }

   }

}
