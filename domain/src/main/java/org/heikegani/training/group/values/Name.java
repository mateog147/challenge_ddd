package org.heikegani.training.group.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Name implements ValueObject<String> {
    private final String name;

    public Name(String name) {
        this.name = Objects.requireNonNull(name, "Name require a value");
    }

    @Override
    public String value() {
        return this.name;
    }
}
