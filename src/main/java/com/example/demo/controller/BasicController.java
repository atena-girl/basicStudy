package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BasicController {
    @PutMapping("/saveList")
    public @ResponseBody String test() {

        return "success";
    }
}
