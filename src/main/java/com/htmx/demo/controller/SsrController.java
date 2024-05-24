package com.htmx.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SsrController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/furtherInfo")
    public String furtherInfo() {
        return "furtherInfo";
    }
}
