package com.ems.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/index")
    public String toIndex(){
        return "ems/login";
    }

    @GetMapping("/register")
    public String toRegister(){
        return "ems/register";
    }

    @GetMapping("/addEmp")
    public String toAddEmp(){
        return "ems/addEmp";
    }


}
