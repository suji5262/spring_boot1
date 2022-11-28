package com.example.todolist.todo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class TodoController {

    private ArrayList<String> todoList = new ArrayList<>();

    @GetMapping("/list")
    public ArrayList<String> list() {
        return todoList;
    }

    @GetMapping("/receiveList")
    public ArrayList<String> receiveList(String todo) {
        todoList.add(todo);
        return todoList;
    }
    // 할일을 등록, 파라미터이름 = _todo(String)

    @GetMapping("/deleteList")
    public ArrayList<String> receiveList(int todo) {
        todoList.remove(todo);
        return todoList;
    }
    // 할일을 삭제
}
//@RestController → json 형태로 객체 데이터 반환