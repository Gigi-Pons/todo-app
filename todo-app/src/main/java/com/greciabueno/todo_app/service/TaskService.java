package com.greciabueno.todo_app.service;

import com.greciabueno.todo_app.model.Task;
import com.greciabueno.todo_app.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
    @Autowired
    private TaskRepository repo;

    public Task add(Task task) {
        return repo.save(task);
    }

}
