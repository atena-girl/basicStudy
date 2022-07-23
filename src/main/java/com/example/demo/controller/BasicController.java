package com.example.demo.controller;
import com.example.demo.data.entity.ListEntitiy;
import com.example.demo.data.repository.ListRepository;
import com.example.demo.service.TodoList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class BasicController {

    @Autowired
    ListRepository listRepository;

    @Autowired
    TodoList todoList;

    @CrossOrigin("*")
    @PutMapping("/saveList")
    public String saveList(@RequestBody Map<String, Object> item) {

        todoList.setTodoList(item);

        return "success";
    }

    @CrossOrigin("*")
    @GetMapping("/getList")
    public List<ListEntitiy> getList() {

        return todoList.getTodoList();
    }

    @CrossOrigin("*")
    @DeleteMapping("/deleteItem")
    public String deleteItem(@RequestBody Map<String, Object> list) {
        todoList.deleteTodoList(list);
        String status = "200";
        return status;
    }
}
