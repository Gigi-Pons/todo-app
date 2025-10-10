package com.greciabueno.todo_app.controller;

import com.greciabueno.todo_app.model.Task;
import com.greciabueno.todo_app.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TaskController {
    @Autowired
    private TaskService service;

    @PostMapping
    public Task create(@RequestBody Task task) {
        return service.add(task);
    }
}
