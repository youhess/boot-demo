package com.tutorial.boot_demo.controller;

import com.tutorial.boot_demo.Response;
import com.tutorial.boot_demo.dao.User;
import com.tutorial.boot_demo.dto.UserDTO;
import com.tutorial.boot_demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/{id}")
    public Response<UserDTO> getUserById(@PathVariable long id){
        return Response.newSuccess(userService.getUserById(id));
    }

    @PostMapping("/userAdd")
    public Response<Long> getUserById(@RequestBody UserDTO userDTO) throws IllegalAccessException { // RequestBody用于接受前端的一个json参数
        // 此处一般有校验，但是为了快速开发就省略了
        return Response.newSuccess(userService.addNewUser(userDTO));
    }

}
