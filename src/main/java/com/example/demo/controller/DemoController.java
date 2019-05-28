package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Czy on 2019/5/28.
 */
@RestController
@RequestMapping(value = "/api/demo")
public class DemoController {

    @GetMapping(value = "/str")
    public String returnStr(){
        return "Hello";
    }
}
