package com.example.todo;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private final List<Task> tasks = new ArrayList<>();
    private int nextId = 1;

    public void addTask(String description) {
        tasks.add(new Task(nextId++, description));
    }

    public void markTaskCompleted(int id) {
        tasks.stream()
                .filter(task -> task.getId() == id)
                .findFirst()
                .ifPresent(Task::markCompleted);
    }

    public List<Task> getTasks() {
        return new ArrayList<>(tasks);
    }
}