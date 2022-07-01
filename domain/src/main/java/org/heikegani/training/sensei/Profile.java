package org.heikegani.training.sensei;

import co.com.sofka.domain.generic.Entity;
import org.heikegani.training.sensei.values.Course;
import org.heikegani.training.sensei.values.ProfioeId;

import java.util.Objects;
import java.util.Set;

public class Profile extends Entity<ProfioeId> {
    private Set<Course> courses;

    public Profile(ProfioeId entityId) {
        super(entityId);
    }

    public Set<Course> courses() {
        return courses;
    }

    public void addCourse(Course newCourse){
        this.courses.add(Objects.requireNonNull(newCourse));
    }
}
