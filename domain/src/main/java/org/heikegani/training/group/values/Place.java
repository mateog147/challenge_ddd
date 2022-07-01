package org.heikegani.training.group.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Locale;
import java.util.Objects;

public class Place implements ValueObject<String> {
    private final String placeName;

    public Place(String placeName) {
        this.placeName = Objects.requireNonNull(placeName).toUpperCase(Locale.ROOT);
    }

    @Override
    public String value() {

        return this.placeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Place place = (Place) o;
        return Objects.equals(placeName, place.placeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(placeName);
    }
}
