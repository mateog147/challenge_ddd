package org.heikegani.training.sensei.commands;

import co.com.sofka.domain.generic.Command;
import org.heikegani.training.sensei.values.Course;

public class AddCourse extends Command {
    private final Course newCourse;

    public AddCourse(Course newCourse) {
        this.newCourse = newCourse;
    }

    public Course getNewCourse() {
        return newCourse;
    }
}
