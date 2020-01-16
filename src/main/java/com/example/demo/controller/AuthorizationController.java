package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Auther: wangzhiqi
 * @Date: 2020/1/3 10:00
 * @Description:
 */
@Controller
public class AuthorizationController {

    @GetMapping("/sys/index")
    public String index(Model model){
        model.addAttribute("username", "wnaghziqi");
        return "index";
    }

}
