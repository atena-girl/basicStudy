package com.example.demo.controller;
import com.example.demo.data.entity.ListEntitiy;
import com.example.demo.data.repository.ListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
public class BasicController {

    @Autowired
    ListRepository listRepository;

    @CrossOrigin("*")
    @PutMapping("/saveList")
    public String test(@RequestBody Map<String, Object> list) {
        listRepository.findAll();
        ListEntitiy listOfEntity = new ListEntitiy();

        listOfEntity.setContent(list.get("newContent").toString());
        listRepository.save(listOfEntity);

        return "success";
    }
}
