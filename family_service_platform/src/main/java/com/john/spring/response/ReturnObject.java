package com.john.spring.response;

public class ReturnObject<T> {

   private T result;
   private Integer code = 200;
   private String message = "success";

   public ReturnObject(T result) {
      this.result = result;
   }

   public ReturnObject() {
   }

   public Integer getCode() {
      return code;
   }

   public void setCode(Integer code) {
      this.code = code;
   }

   public T getResult() {
      return result;
   }

   public void setResult(T result) {
      this.result = result;
   }

   public String getMessage() {
      return message;
   }

   public void setMessage(String message) {
      this.message = message;
   }
}
