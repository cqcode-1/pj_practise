package com.john.spring.service;

import com.john.spring.dao.TblCompanyMapper;
import com.john.spring.entity.TblCompany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstateService {

   @Autowired
   private TblCompanyMapper tblCompanyMapper;

   public List<TblCompany> queryCompany(){
      return tblCompanyMapper.queryCompany();
   }
}
