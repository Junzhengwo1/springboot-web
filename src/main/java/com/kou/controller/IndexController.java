package com.kou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

/**
 * @author JIAJUN KOU
 */
//在template目录下面的所有资源，只能通过controller来跳转

@Controller
public class IndexController {

    @RequestMapping("/index")
    public String test(Model model){
        model.addAttribute("msg","hello,寇王和秦王");
        model.addAttribute("users", Arrays.asList("kou","king"));
        return "index";
    }
}
