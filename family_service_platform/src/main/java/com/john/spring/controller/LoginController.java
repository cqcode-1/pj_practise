package com.john.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Controller
@ResponseBody
@CrossOrigin(originPatterns = "*", allowedHeaders = "*", methods = {}, allowCredentials = "true")
public class LoginController {

   @RequestMapping("/auth/login")
   public String test01(@RequestBody Map<String, Object> map){
      System.out.println("LOGIN");
      System.out.println(map);
      return "success";
   }

   @RequestMapping("/2step-code")
   public String test02(ModelMap modelMap){
      System.out.println("test");
      modelMap.put("ss", "result");
      return "success";
   }
}
