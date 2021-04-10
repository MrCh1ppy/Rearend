package com.example.demo.config;

import com.example.demo.interceptor.LoginHandlerInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        ////////添加登录过滤器//////////
        List<String> loginList=new ArrayList<>();
        loginList.add("/login.html");
        loginList.add("/index.html");
        loginList.add("/");
        loginList.add("/asserts/**");
        registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**").excludePathPatterns(loginList);
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("main/login");
        registry.addViewController("/index.html").setViewName("main/login");
        registry.addViewController("/main.html").setViewName("main/dashboard");
    }
}
