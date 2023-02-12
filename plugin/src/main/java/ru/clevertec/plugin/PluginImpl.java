package ru.clevertec.plugin;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class PluginImpl implements Plugin<Project> {
    @Override
    public void apply(Project project) {
        project.getTasks().create("pluginTask", Task.class);
    }
}
