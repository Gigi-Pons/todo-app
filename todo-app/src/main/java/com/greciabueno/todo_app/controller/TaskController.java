package com.greciabueno.todo_app.controller;

import com.greciabueno.todo_app.model.Task;
import com.greciabueno.todo_app.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    @Autowired
    private TaskService service;

    @PostMapping("/add")
    public ResponseEntity<Task> create(
            @RequestBody Task task,
            UriComponentsBuilder uriBuilder) {

        Task saved = service.add(task);

        //assign location header pointing to where the new resource lives
        var uri = uriBuilder
                .path("/tasks/add/{id}")
                .buildAndExpand(saved.getId())
                .toUri();

        return ResponseEntity.created(uri).body(saved);
    }

//    @PatchMapping("/{id}/completed")
//    public Res
}
