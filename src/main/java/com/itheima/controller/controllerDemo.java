package com.itheima.controller;

import com.itheima.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hotel")
public class controllerDemo {

    @RequestMapping("/findByUser")
    @ResponseBody
    public User test(User user){
        System.out.println(user.getUsername());
        return user;
    }
}
