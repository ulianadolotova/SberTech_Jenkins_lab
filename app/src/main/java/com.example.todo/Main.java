package com.example.todo;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        manager.addTask("Сделать домашнее задание");
        manager.addTask("Выучить Maven");
        manager.markTaskCompleted(1);

        System.out.println("Список задач:");
        manager.getTasks().forEach(System.out::println);
    }
}