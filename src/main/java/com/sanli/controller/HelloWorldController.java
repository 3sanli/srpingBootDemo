package com.sanli.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

@RestController
public class HelloWorldController {
    @RequestMapping("/hello")
    public String Hello(){
        return "SpringBootNiuBi!!";
    }

    @RequestMapping("/index")
    public String indexPage(Model model){
        model.addAttribute("count number",4);
        return "index";
    }
}
