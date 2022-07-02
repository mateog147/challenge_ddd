package org.heikegani.training.sensei;

import co.com.sofka.domain.generic.Entity;
import org.heikegani.training.sensei.values.Course;
import org.heikegani.training.sensei.values.ProfileId;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Profile extends Entity<ProfileId> {
    private Set<Course> courses;

    public Profile(ProfileId entityId) {

        super(entityId);

        courses = new HashSet<>();
    }

    public Set<Course> courses() {
        return courses;
    }

    public void addCourse(Course newCourse){
        this.courses.add(Objects.requireNonNull(newCourse));
    }
}
