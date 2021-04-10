package com.example.demo.controller;

import com.example.demo.pojo.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("user/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, Model model, HttpSession session){
        if(StringUtils.isEmpty(username)||StringUtils.isEmpty(password)){
            model.addAttribute("msg","用户名,密码为空");
            return "index";
        }else{
            User user=userService.getUserByName(username);
            if(null==user||!password.equals(user.getPassword())){
                session.setAttribute("loginUserName",username);
                return "redirect:/main.html";
            }else{
                model.addAttribute("msg","用户名||密码错误");
                return "index";
            }
        }
    }

}
