package org.heikegani.training.sensei.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Tool implements ValueObject<String> {
    private final String name;
    private final String branch;

    public Tool(String name, String branch) {
        this.name = Objects.requireNonNull(name);
        this.branch = Objects.requireNonNull(branch);
    }

    @Override
    public String value() {
        return "Herramienta:"+ this.name + " Marca:" + this.branch;
    }
}
