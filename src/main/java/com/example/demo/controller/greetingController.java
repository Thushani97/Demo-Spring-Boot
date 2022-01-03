package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class greetingController {
    @RequestMapping("/page1")
    public ModelAndView getPage() {return new ModelAndView( "page1.html");}
}
