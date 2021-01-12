package com.example.my_springboot_study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @RequestMapping("/login")
    public String login(
            @RequestParam("username") String username,
            @RequestParam("password") String password,
            Model model, HttpSession session){
        //具体的业务:
        if(!StringUtils.isEmpty(username) && "123456".equals(password)){
            session.setAttribute("loginUser",username);
            //重定向到 /main.html
            //在 MyMvcConfiguration 中配置了与 首页 的映射关系
            return "redirect: /main.html";
        }else {
            //告诉用户，登录失败
            model.addAttribute("msg","用户名或密码错误!");
            return "index";
        }
    }
}
