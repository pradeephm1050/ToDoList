package todo;

//package com.todo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoList toDoList = new ToDoList();

        while (true) {
            System.out.println("1. Add Task");
            System.out.println("2. Edit Task");
            System.out.println("3. Delete Task");
            System.out.println("4. Display Tasks");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter task name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    System.out.print("Enter due date: ");
                    String dueDate = scanner.nextLine();
                    toDoList.addTask(new Task(0, name, description, dueDate));
                    break;
                case 2:
                    System.out.print("Enter task ID to edit: ");
                    int editId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character
                    System.out.print("Enter updated task name: ");
                    String updatedName = scanner.nextLine();
                    System.out.print("Enter updated task description: ");
                    String updatedDescription = scanner.nextLine();
                    System.out.print("Enter updated due date: ");
                    String updatedDueDate = scanner.nextLine();
                    toDoList.editTask(editId, new Task(0, updatedName, updatedDescription, updatedDueDate));
                    break;
                case 3:
                    System.out.print("Enter task ID to delete: ");
                    int deleteId = scanner.nextInt();
                    toDoList.deleteTask(deleteId);
                    break;
                case 4:
                    toDoList.displayTasks();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }

        }
    }
}
