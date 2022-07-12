package com.example.demo.controller;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
public class BasicController {
    @CrossOrigin("*")
    @PutMapping("/saveList")
    public String test(@RequestBody Map<String, Object> a) {

        return "success";
    }
}
