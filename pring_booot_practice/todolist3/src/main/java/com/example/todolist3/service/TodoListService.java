package com.example.todolist3.service;

import com.example.todolist3.mapper.TodoListMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TodoListService {

    @Autowired
    TodoListMapper tr;

    public int insertTodo(String todo) {
        return tr.insertTodo(todo);
    }

    public ArrayList<String> selectTodo() {
        return tr.selectTodo();
    }
}
