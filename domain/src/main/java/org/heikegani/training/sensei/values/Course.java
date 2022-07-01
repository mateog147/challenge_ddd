package org.heikegani.training.sensei.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Course implements ValueObject<String> {

    private final String course;

    public Course(String course) {
        if(course.isBlank()){
            throw new IllegalArgumentException("Course need a string value");
        }
        this.course = course.toLowerCase();
    }

    @Override
    public String value() {
        return this.course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course1 = (Course) o;
        return Objects.equals(course, course1.course);
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }
}
