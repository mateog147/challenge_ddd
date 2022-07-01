package org.heikegani.training.session.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Attendee implements ValueObject<String> {
    private final String document;

    public Attendee(String document) {
        if(document.isBlank()){
            throw new IllegalArgumentException("document is mandatory");
        }
        this.document = Objects.requireNonNull(document);
    }

    @Override
    public String value() {
        return this.document;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Attendee attendee = (Attendee) o;
        return Objects.equals(document, attendee.document);
    }

    @Override
    public int hashCode() {
        return Objects.hash(document);
    }
}
