package org.heikegani.training.session.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Comment implements ValueObject<String> {
    private final String comment;

    public Comment(String comment) {
        if(comment.isBlank()){
            throw new IllegalArgumentException("comment must be a valid string");
        }
        this.comment = comment;
    }

    @Override
    public String value() {
        return this.comment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comment comment1 = (Comment) o;
        return Objects.equals(comment, comment1.comment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(comment);
    }
}
