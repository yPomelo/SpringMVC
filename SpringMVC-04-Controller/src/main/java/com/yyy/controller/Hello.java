package com.yyy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hello {
    @RequestMapping("/mytest")
    public String MyTest(Model model){
        model.addAttribute("msg","HELLO!Spring!");
        return "Hello";
    }
    @GetMapping("/add/{a}/{b}")
    public String Mytest1(@PathVariable int a,@PathVariable int b, Model model){
        int c = a+b;
        model.addAttribute("msg","结果为"+c);
        return "Hello";
    }
    @PostMapping("/add/{a}/{b}")
    public String Mytest2(@PathVariable int a,@PathVariable int b, Model model){
        int c = a+b;
        model.addAttribute("msg","结果为"+c);
        return "Hello";
    }
}
