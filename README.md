# Task Management Application

This project is a simple Task Management Application designed to help you practice and familiarize yourself with the new features introduced in Java 8. The application covers a variety of Java 8 features, including lambda expressions, functional interfaces, Streams API, Optional class, default and static methods in interfaces, method references, new Date and Time API, collections improvements, concurrency enhancements, Nashorn JavaScript engine, and type annotations.

## Table of Contents
1. [Project Setup](#project-setup)
2. [Core Features Implementation](#core-features-implementation)
3. [Advanced Features Implementation](#advanced-features-implementation)
4. [Testing and Documentation](#testing-and-documentation)
5. [Deployment and Maintenance](#deployment-and-maintenance)

## Project Setup
1. **Initialize Git Repository**
    - Create a new repository on GitHub named `task-management-app`.
    - Clone the repository to your local machine.
    - Set up a Maven or Gradle project structure.

## Core Features Implementation
1. **Lambda Expressions**
    - Create a `Task` class with fields `id`, `name`, `description`, `dueDate`, and `status`.
    - Implement a method `filterTasksByDueDate(List<Task> tasks, LocalDate dueDate)` using lambda expressions to filter tasks.

2. **Functional Interfaces**
    - Define a functional interface `TaskPredicate` with a method `boolean test(Task task)`.
    - Implement a method `filterTasks(List<Task> tasks, TaskPredicate predicate)` that uses the `TaskPredicate` interface.

3. **Streams API**
    - Create a method `findOverdueTasks(List<Task> tasks)` using the Streams API to filter tasks with a due date before today.
    - Implement a method `countTasksByStatus(List<Task> tasks)` using the Streams API to count tasks by their status.
    - Create a method `groupTasksByDueDate(List<Task> tasks)` to group tasks by due date.

4. **Optional Class**
    - Implement a method `findTaskById(List<Task> tasks, int id)` returning an `Optional<Task>`.
    - Use `Optional` methods like `ifPresent` and `orElse` to handle the result.

5. **Default and Static Methods in Interfaces**
    - Define an interface `TaskRepository` with default methods like `getTaskById(int id)` and static methods like `createTask(int id, String name)`.

6. **Method References**
    - Use method references to print task details (e.g., `tasks.forEach(System.out::println)`).
    - Implement a method `sortTasksByDueDate(List<Task> tasks)` using method references to compare tasks by due date.

## Advanced Features Implementation
1. **Date and Time API**
    - Replace old date classes with `java.time.LocalDate` and `java.time.LocalDateTime`.
    - Create methods like `calculateTaskDuration(Task task)` and `isTaskOverdue(Task task)` using the new Date and Time API.

2. **Collections Improvements**
    - Use `forEach` to iterate over tasks and print details.
    - Use `removeIf` to remove tasks with a certain status.
    - Use `replaceAll` to update task descriptions.
    - Use `computeIfAbsent` to manage a map of tasks.

3. **Concurrency Enhancements**
    - Implement a method `fetchTasksAsync()` using `CompletableFuture` to simulate fetching tasks from an external service asynchronously.

4. **Nashorn JavaScript Engine**
    - Write a simple script using Nashorn to manipulate task data and execute it within your Java code.

5. **Type Annotations**
    - Create a custom type annotation `@Validated` and use it on your `Task` class or methods.

## Testing and Documentation
1. **Unit Testing**
    - Write unit tests for all the implemented methods using JUnit.
    - Ensure to use lambda expressions and the Streams API within your test cases.

2. **Documentation**
    - Document your code with Javadoc comments.
    - Write a detailed README for your GitHub repository explaining the purpose of the project and each implemented feature.

## Deployment and Maintenance
1. **Build Automation**
    - Set up a GitHub Actions workflow to build and test your project on every push.

2. **Refactoring and Optimization**
    - Review your code for readability and performance improvements.
    - Refactor where necessary to make better use of Java 8 features.

---

By following this README, you will be able to practice and get hands-on experience with the new features introduced in Java 8. Feel free to adjust the steps and features based on your learning pace and preferences.