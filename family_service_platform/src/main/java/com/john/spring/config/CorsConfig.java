package com.john.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

//@Configuration
public class CorsConfig {

   private CorsConfiguration buildConfig(){
      final CorsConfiguration corsConfiguration = new CorsConfiguration();
      //设置允许所有来源
      corsConfiguration.addAllowedOriginPattern("*");
      //允许所有请求头
      corsConfiguration.addAllowedHeader("*");
      //允许搜友请求方法
      corsConfiguration.addAllowedMethod("*");
      //设置跨域请求过来使用同一个session
      corsConfiguration.setAllowCredentials(true);
      return corsConfiguration;
   }

   @Bean
   public CorsFilter corsFilter(){
      final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
      source.registerCorsConfiguration("/**", buildConfig());
      return new CorsFilter(source);
   }
}
