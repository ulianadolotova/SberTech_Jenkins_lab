package com.example.todo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    @Test
    void markCompleted() {
        Task task = new Task(1, "Test");
        assertFalse(task.isCompleted());
        task.markCompleted();
        assertTrue(task.isCompleted());
    }

    @Test
    void testEqualsAndHashCode() {
        Task task1 = new Task(1, "Test");
        Task task2 = new Task(1, "Test");

        assertEquals(task1, task2);
        assertEquals(task1.hashCode(), task2.hashCode());
    }
}