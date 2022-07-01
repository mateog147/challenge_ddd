package org.heikegani.training.session.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Turnout implements ValueObject<Integer> {

    private final Integer turnout;

    public Turnout() {
        this.turnout = 0;
    }

    private Turnout(Integer turnout) {
        this.turnout = turnout;
    }

    public Turnout addOne(){
        return new Turnout(this.turnout+1);
    }


    @Override
    public Integer value() {
        return this.turnout;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Turnout turnout1 = (Turnout) o;
        return Objects.equals(turnout, turnout1.turnout);
    }

    @Override
    public int hashCode() {
        return Objects.hash(turnout);
    }
}
