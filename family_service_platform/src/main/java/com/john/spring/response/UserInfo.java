package com.john.spring.response;

import java.util.List;

public class UserInfo {

   private String name;
   private String avatar = "/avatar2.jpg";
   private Permissions role;

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getAvatar() {
      return avatar;
   }

   public void setAvatar(String avatar) {
      this.avatar = avatar;
   }

   public Permissions getRole() {
      return role;
   }

   public void setRole(Permissions role) {
      this.role = role;
   }
}
