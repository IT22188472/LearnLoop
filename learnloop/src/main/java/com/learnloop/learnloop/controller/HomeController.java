package com.learnloop.learnloop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index";  // Home page (index.html)
    }

    @GetMapping("/page1")
    public String page1() {
        return "page1";  // Page 1 view (page1.html)
    }

    @GetMapping("/page2")
    public String page2() {
        return "page2";  // Page 2 view (page2.html)
    }

    @GetMapping("/page3")
    public String page3() {
        return "page3";  // Page 3 view (page3.html)
    }
}
