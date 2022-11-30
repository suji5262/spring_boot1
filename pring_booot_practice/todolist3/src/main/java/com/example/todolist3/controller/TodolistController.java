package com.example.todolist3.controller;

import com.example.todolist3.mapper.TodoListMapper;
import com.example.todolist3.service.TodoListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class TodolistController {
// list
// receiveList
// deleteList

    @Autowired
    TodoListService ts;

    @GetMapping("/list")
    public ArrayList<String> list() {
        return ts.selectTodo();
    }

    @GetMapping("/receiveList")
    public ArrayList<String> receiveList(String todo) {
        ts.insertTodo(todo);

        return ts.selectTodo();
    }

    @GetMapping("/deleteList")
    public ArrayList<String> deleteList() {

        return ts.selectTodo();
    }
}
