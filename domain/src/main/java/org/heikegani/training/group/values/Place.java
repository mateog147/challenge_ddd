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
}
