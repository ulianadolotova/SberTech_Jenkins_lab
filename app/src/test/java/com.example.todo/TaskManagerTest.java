package com.example.todo;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TaskManagerTest {

    @Test
    void addTask() {
        TaskManager manager = new TaskManager();
        manager.addTask("Test task");

        List<Task> tasks = manager.getTasks();
        assertEquals(1, tasks.size());
        assertEquals("Test task", tasks.get(0).getDescription());
        assertFalse(tasks.get(0).isCompleted());
    }

    @Test
    void markTaskCompleted() {
        TaskManager manager = new TaskManager();
        manager.addTask("Test task");
        manager.markTaskCompleted(1);

        assertTrue(manager.getTasks().get(0).isCompleted());
    }

    @Test
    void getTasks() {
        TaskManager manager = new TaskManager();
        manager.addTask("Task 1");
        manager.addTask("Task 2");

        List<Task> tasks = manager.getTasks();
        assertEquals(2, tasks.size());
    }
}