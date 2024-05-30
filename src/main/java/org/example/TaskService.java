package org.example;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskService {

    /**
     * Lambda expressions
     */
    public List<Task> filerTasksByDueDate(List<Task> tasks, LocalDate dueDate){
        return tasks.stream()
                .filter(task -> task.getDueDate().equals(dueDate))
                .collect(Collectors.toList());
    }
}
