package org.heikegani.training.group.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class City implements ValueObject<String> {

    private final String city;

    public City(String city) {
        this.city = Objects.requireNonNull(city);
    }

    @Override
    public String value() {
        return this.city;
    }
}
