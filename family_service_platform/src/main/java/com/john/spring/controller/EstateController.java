package com.john.spring.controller;

import com.alibaba.fastjson.JSONObject;
import com.john.spring.entity.FcEstate;
import com.john.spring.entity.TblCompany;
import com.john.spring.response.ReturnObject;
import com.john.spring.service.EstateService;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(originPatterns = "*", allowedHeaders = "*", methods = {}, allowCredentials = "true")
public class EstateController {

   @Autowired
   EstateService estateService;

   @RequestMapping("/estate/queryCompany")
   public String queryCompany(){
      System.out.println("queryCompany");
      final List<TblCompany> companies = estateService.queryCompany();
      final ReturnObject<List<TblCompany>> listReturnObject = new ReturnObject<>(companies);
      final String s = JSONObject.toJSONString(listReturnObject);
      System.out.println(s);
      return s;
   }

   @RequestMapping("/estate/insertEstate")
   public String insertEstate(FcEstate fcEstate,@RequestParam("code") String code){
      System.out.println("/estate/insertEstate" + code);
      return "";
   }

}
