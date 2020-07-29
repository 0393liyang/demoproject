package com.stephen.study.demoproject.controller;

import com.stephen.study.demoproject.entity.userabc;
import com.stephen.study.demoproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @PostMapping(value = "/add")
    public int addUser(userabc userabc){
        return userService.addUser(userabc);
    }

    @ResponseBody
    @GetMapping(value = "/all")
    public Object findAllUser(@RequestParam(name = "pageNum",required = false,defaultValue = "1") int pageNum,
                              @RequestParam(name = "pageSize",required = false,defaultValue = "10") int pageSize){

        return userService.findAllUser(pageNum,pageSize);
    }
}
