package org.heikegani.training.sensei.commands;

import co.com.sofka.domain.generic.Command;
import org.heikegani.training.sensei.values.Course;
import org.heikegani.training.sensei.values.SenseiId;

public class AddCourse extends Command {
    private final SenseiId senseiId;
    private final Course newCourse;

    public AddCourse(SenseiId senseiId, Course newCourse) {
        this.senseiId = senseiId;
        this.newCourse = newCourse;
    }

    public SenseiId getSenseiId() {
        return senseiId;
    }

    public Course getNewCourse() {
        return newCourse;
    }
}
