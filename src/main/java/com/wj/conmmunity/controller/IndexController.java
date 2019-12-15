package com.wj.conmmunity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
    @GetMapping("/hello")
//    @ResponseBody
    public String index(@RequestParam String name, Model model){
        model.addAttribute("name",name);
        return "hello";
    }
}
