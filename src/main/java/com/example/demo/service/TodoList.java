package com.example.demo.service;

import com.example.demo.data.entity.ListEntitiy;
import com.example.demo.data.repository.ListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TodoList {
    @Autowired
    ListRepository listRepository;

    public void setTodoList(Map<String, Object> list) {
        ListEntitiy listOfEntity = new ListEntitiy();
        listOfEntity.setContent(list.get("newContent").toString());

        listRepository.save(listOfEntity);
    }

    public List<ListEntitiy> getTodoList() {
        return listRepository.findAll();
    }

    public void deleteTodoList(Map<String, Object> list)
    {
        List<Integer> beDeleted = (List<Integer>) list.get("deletedIndexList");
        for (Integer deleteItem : beDeleted) {
            listRepository.deleteByContentKey(deleteItem);
        }

    }
}
