package todo;

//package com.todo;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private List<Task> tasks;
    private int nextId;

    public ToDoList() {
        tasks = new ArrayList<>();
        nextId = 1;
    }

    public void addTask(Task task) {
        task.setId(nextId++);
        tasks.add(task);
        System.out.println("Task added successfully.");
    }

    public void editTask(int taskId, Task updatedTask) {
        for (Task task : tasks) {
            if (task.getId() == taskId) {
                task.setName(updatedTask.getName());
                task.setDescription(updatedTask.getDescription());
                task.setDueDate(updatedTask.getDueDate());
                System.out.println("Task updated successfully.");
                return;
            }
        }
        System.out.println("Task not found.");
    }

    public void deleteTask(int taskId) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getId() == taskId) {
                tasks.remove(i);
                System.out.println("Task deleted successfully.");
                return;
            }
        }
        System.out.println("Task not found.");
    }

    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks found.");
            return;
        }
        System.out.println("ID\tName\tDescription\tDue Date");
        for (Task task : tasks) {
            System.out.println(task.getId() + "\t" + task.getName() + "\t" + task.getDescription() + "\t" + task.getDueDate());
        }
    }
}
