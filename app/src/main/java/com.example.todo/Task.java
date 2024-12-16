package com.example.todo;

import java.util.Objects;

public class Task {
    private final int id;
    private final String description;
    private boolean completed;

    public Task(int id, String description) {
        this.id = id;
        this.description = description;
        this.completed = false;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void markCompleted() {
        this.completed = true;
    }

    @Override
    public String toString() {
        return "Task{" +
               "id=" + id +
               ", description='" + description + '\'' +
               ", completed=" + completed +
               '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return id == task.id && completed == task.completed && Objects.equals(description, task.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description, completed);
    }
}