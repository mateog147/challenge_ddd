package org.heikegani.training.sensei.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.heikegani.training.sensei.values.Course;

public class CourseAdded extends DomainEvent {
    private final Course course;

    public CourseAdded(Course newCourse) {
        super("heikegani.sensei.courseadded");
        this.course = newCourse;
    }

    public Course getCourse() {
        return course;
    }
}
