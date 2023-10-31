package com.ts.controller;

import com.ts.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @title UserCoontroller
 * @date 2023/10/31 22:06
 * @author ts happy boy
 * @description TODO
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/hello")
    public String hello(){
        return userService.hello();
    }
}



