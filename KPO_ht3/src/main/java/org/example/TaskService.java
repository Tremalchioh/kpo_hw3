package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public List<Task> findAll() {
        return taskRepository.findAll();
    }

    public Task createTask(String desc, String title) {
        Task task = new Task();
        task.setDesc(desc);
        task.setTitle(title);
        return taskRepository.save(task);
    }
}