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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city1 = (City) o;
        return Objects.equals(city, city1.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city);
    }
}
