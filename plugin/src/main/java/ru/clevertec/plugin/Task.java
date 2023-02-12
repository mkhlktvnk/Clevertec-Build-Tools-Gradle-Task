package ru.clevertec.plugin;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

public class Task extends DefaultTask {
    @TaskAction
    public void executeTask() {
        System.out.println("Task executed!");
    }
}
