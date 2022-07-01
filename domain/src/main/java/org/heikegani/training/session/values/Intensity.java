package org.heikegani.training.session.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Intensity implements ValueObject<Integer> {
    private final Integer intensity;

    public Intensity(Integer intensity) {
        try {
            Objects.requireNonNull(intensity);
            if(intensity<0 || intensity>10){
                throw new IllegalArgumentException("intensity must be a integer between 0 and 10");
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        this.intensity = intensity;
    }

    @Override
    public Integer value() {
        return this.intensity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Intensity intensity1 = (Intensity) o;
        return Objects.equals(intensity, intensity1.intensity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(intensity);
    }
}
