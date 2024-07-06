package com.tutorial.boot_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @GetMapping("/hello")
    public String hello(){
        System.out.println("hello world");
        return "hello world!";
    }

    @GetMapping("/list")
    public List<String> listHello(){
        return List.of("hello","world");
    }
}
