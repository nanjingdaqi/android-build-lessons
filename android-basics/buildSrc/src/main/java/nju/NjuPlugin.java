package nju;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class NjuPlugin implements Plugin<Project> {

    @Override
    public void apply(Project project) {
        System.out.println("This is NJU Plugin");
    }
}
