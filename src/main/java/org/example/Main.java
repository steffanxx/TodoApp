package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private List<String> tasks = new ArrayList<>();

    public void addTask(String task) {
        if (task != null && !task.trim().isEmpty()) {
            tasks.add(task);
        }
    }

    public int getTaskCount() {
        return tasks.size();
    }

    public static void main(String[] args) {
        System.out.println("Приложение TodoApp запущено!");
    }
}