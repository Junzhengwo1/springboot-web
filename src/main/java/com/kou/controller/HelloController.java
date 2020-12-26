package com.kou.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author JIAJUN KOU
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "hello 寇王";
    }

}
