package com.john.spring.controller;

import com.alibaba.fastjson.JSONObject;
import com.john.spring.entity.TblUserRecord;
import com.john.spring.response.Permission;
import com.john.spring.response.Permissions;
import com.john.spring.response.ReturnObject;
import com.john.spring.response.UserInfo;
import com.john.spring.service.LoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.HttpSession;

@Controller
@ResponseBody
@CrossOrigin(originPatterns = "*", allowedHeaders = "*", methods = {}, allowCredentials = "true")
public class LoginController {

   @Autowired
   LoginService mLoginService;

   @RequestMapping("/auth/login")
   public String test01(@RequestParam("username")String username, @RequestParam("password")String password,
                        HttpSession session){
      System.out.println("LOGIN");
      System.out.println(username +"---"+ password);
      TblUserRecord tblUserRecord = mLoginService.login(username, password);
      tblUserRecord.setToken(tblUserRecord.getUserName());
      final ReturnObject<TblUserRecord> resp = new ReturnObject<>();
      resp.setResult(tblUserRecord);
      resp.setCode(200);
      resp.setMessage("success");
      final String result = JSONObject.toJSONString(resp);
      session.setAttribute("userRecord", tblUserRecord);
      System.out.println("-------user info "+session.getId());
      System.out.println(result);
      return result;
   }
//   @RequestMapping("/auth/login")
//   public String test01(@RequestBody Map<String, Object> map){
//      System.out.println("LOGIN");
//      System.out.println(map);
//      return "success";
//   }

   @RequestMapping("/auth/2step-code")
   public String test02(ModelMap modelMap){
      System.out.println("test");
      modelMap.put("ss", "result");
      return "success";
   }

   @GetMapping("/user/info")
   public String getInfo(ModelMap modelMap, HttpSession session){
      System.out.println("-------user info "+session.getId());
      final TblUserRecord userRecord = (TblUserRecord) session.getAttribute("userRecord");
      final String rolePrivileges = userRecord.getUserRole().getRolePrivileges();
      final String[] privileges = rolePrivileges.split("-");
      final ArrayList<Permission> permissions = new ArrayList<>();
      for (String privilege : privileges) {
         permissions.add(new Permission(privilege));
      }

      final UserInfo userInfo = new UserInfo();
      final Permissions role = new Permissions();
      role.setPermissions(permissions);
      userInfo.setRole(role);
      userInfo.setName(userRecord.getUserName());

      final ReturnObject<UserInfo> resp = new ReturnObject<>();
      resp.setResult(userInfo);

      final String s = JSONObject.toJSONString(resp);
      System.out.println(s);
      return s;
   }

   @RequestMapping("/auth/logout")
   public void logout(HttpSession session){
      session.invalidate();
      System.out.println("logout");
   }
}
