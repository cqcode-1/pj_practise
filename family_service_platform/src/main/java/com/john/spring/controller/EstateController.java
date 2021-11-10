package com.john.spring.controller;

import com.alibaba.fastjson.JSONObject;
import com.john.spring.entity.FcBuilding;
import com.john.spring.entity.FcEstate;
import com.john.spring.entity.FcUnit;
import com.john.spring.entity.TblCompany;
import com.john.spring.req.SelectBuilding;
import com.john.spring.req.UnitMessage;
import com.john.spring.response.ReturnObject;
import com.john.spring.service.EstateService;
import com.john.spring.service.base.FcEstateService;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
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

   @RequestMapping("/estate/selectBuilding")
   public String selectBuilding(SelectBuilding building){
      System.out.println("----"+ building);
      final List<FcBuilding> fcBuildings = estateService.selectBuildings(building);
      final ReturnObject<List<FcBuilding>> returnObject = new ReturnObject<>(fcBuildings);
      returnObject.setMessage(fcBuildings != null && fcBuildings.size() > 0 ? "1" : "0");
      return JSONObject.toJSONString(returnObject);
   }

   @RequestMapping("/estate/updateBuilding")
   public String updateBuilding(FcBuilding building){
      System.out.println("updateBuilding---"+ building);
      final Integer result = estateService.updateBuilding(building);
      final ReturnObject<Integer> returnObject = new ReturnObject<>(result);
      returnObject.setMessage(result== 1 ? "1": "0");
      return JSONObject.toJSONString(returnObject);
   }

   @RequestMapping("/estate/updateBuildings")
   public String updateBuildings(@RequestBody FcBuilding[] building){
      System.out.println("updateBuildings---"+ building);
      final Integer result = estateService.updateBuildings(Arrays.asList(building));
      final ReturnObject<Integer> returnObject = new ReturnObject<>(result);
      returnObject.setMessage(result== 1 ? "1": "0");
      return JSONObject.toJSONString(returnObject);
   }

   @RequestMapping("/estate/selectUnit")
   public String selectUnit(@RequestBody UnitMessage[] unitMessages){
      System.out.println("selectUnit---"+ unitMessages);
      final List<FcUnit> fcUnits = estateService.selectUnit(unitMessages);
      final ReturnObject<List<FcUnit>> returnObject = new ReturnObject<>(fcUnits);
      returnObject.setMessage(fcUnits.size() > 0 ? "1": "0");
      return JSONObject.toJSONString(returnObject);
   }

   @RequestMapping("/estate/updateUnit")
   public String selectUnit(FcUnit unit){
      System.out.println("updateUnit---"+ unit);
      final Integer result = estateService.updateUnit(unit);
      final ReturnObject<Object> returnObject = new ReturnObject<>();
      returnObject.setMessage(result ==1  ? "1": "0");
      return JSONObject.toJSONString(returnObject);
   }

   @RequestMapping("/estate/updateUnits")
   public String selectUnit(@RequestBody List<FcUnit> units){
      System.out.println("updateUnit---"+ units);
      final Integer result = estateService.updateUnits(units);
      final ReturnObject<Object> returnObject = new ReturnObject<>();
      returnObject.setMessage(result ==1  ? "1": "0");
      return JSONObject.toJSONString(returnObject);
   }
}
