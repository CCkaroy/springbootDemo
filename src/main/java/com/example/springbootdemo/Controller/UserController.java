package com.example.springbootdemo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/user")
@RestController
public class UserController {

    @RequestMapping("/test")
    public String test(int i){
        System.out.println(i);
        return "调用成功";
    }


}
