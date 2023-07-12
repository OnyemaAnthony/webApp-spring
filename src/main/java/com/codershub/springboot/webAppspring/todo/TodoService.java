package com.codershub.springboot.webAppspring.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    private static List<Todo>todos = new ArrayList<>();

    static {
        todos.add(new Todo(1,"Anthony","learn java", LocalDate.now().plusYears(1),false));
        todos.add(new Todo(2,"Micheal","learn devop", LocalDate.now().plusYears(2),false));
        todos.add(new Todo(3,"Chibuike","learn spanish", LocalDate.now().plusYears(3),true));
        todos.add(new Todo(4,"Ebuka","learn foresh", LocalDate.now().plusYears(1),true));

    }

    public List<Todo>findByUsername(String username){
        return  todos;
    }
}
