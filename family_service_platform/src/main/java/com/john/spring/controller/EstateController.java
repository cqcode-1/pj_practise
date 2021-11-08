package com.john.spring.controller;

import com.alibaba.fastjson.JSONObject;
import com.john.spring.entity.FcEstate;
import com.john.spring.entity.TblCompany;
import com.john.spring.response.ReturnObject;
import com.john.spring.service.EstateService;
import com.john.spring.service.base.FcEstateService;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@Controller
@ResponseBody
@CrossOrigin(originPatterns = "*", allowedHeaders = "*", methods = {RequestMethod.GET, RequestMethod.POST}, allowCredentials = "true")
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

   @RequestMapping(value="/estate/insertEstate", method = RequestMethod.POST)
   public String insertEstate(FcEstate fcEstate){
      int s = estateService.insert(fcEstate);
      final ReturnObject<String> returnObject = new ReturnObject<String>();
      returnObject.setMessage(s ==1 ?"1" : "0");
      returnObject.setResult(s==1? "插入成功": "记录已存在");
      return JSONObject.toJSONString(returnObject);
   }

}
