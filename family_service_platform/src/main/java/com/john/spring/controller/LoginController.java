package com.john.spring.controller;

import com.alibaba.fastjson.JSONObject;
import com.john.spring.entity.TblUserRecord;
import com.john.spring.service.LoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Controller
@ResponseBody
@CrossOrigin(originPatterns = "*", allowedHeaders = "*", methods = {}, allowCredentials = "true")
public class LoginController {

   @Autowired
   LoginService mLoginService;

   @RequestMapping("/auth/login")
   public String test01(@RequestParam("username")String username, @RequestParam("password")String password  ){
      System.out.println("LOGIN");
      System.out.println(username +"---"+ password);
      TblUserRecord tblUserRecord = mLoginService.login(username, password);
      final String result = JSONObject.toJSONString(tblUserRecord);
      System.out.println(result);
      return result;
   }
//   @RequestMapping("/auth/login")
//   public String test01(@RequestBody Map<String, Object> map){
//      System.out.println("LOGIN");
//      System.out.println(map);
//      return "success";
//   }

   @RequestMapping("/2step-code")
   public String test02(ModelMap modelMap){
      System.out.println("test");
      modelMap.put("ss", "result");
      return "success";
   }
}
