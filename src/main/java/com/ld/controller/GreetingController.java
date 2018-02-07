package com.ld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * class description
 * company  corswork
 * Created by ludong on 2018/2/6.
 */
@Controller
public class GreetingController {
    @RequestMapping("/greeting")
    public String greeting(Model model,@RequestParam(value ="name")String name){
        model.addAttribute("name",name);
        return "home";
    }
}
