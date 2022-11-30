package com.example.todolist3.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface TodoListMapper {

    public int insertTodo(String todo);
    public ArrayList<String> selectTodo();


}
//인터페이스와 mapper(TodoList.xml) 는 한쌍 - mybatis