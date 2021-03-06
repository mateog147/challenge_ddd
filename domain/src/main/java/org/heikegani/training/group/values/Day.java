package org.heikegani.training.group.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Day implements ValueObject<String> {
    private enum Days{LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO};

    private Days day;

    public Day(String day) {

        try {
            if(day.isBlank()){
                throw new IllegalArgumentException("Day provided is not valid");
            }
            String _day= day.toUpperCase();

            if(!isValid(day)){
                throw new IllegalArgumentException("Day provided is not valid");
            }
            this.day = Days.valueOf(_day);

        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage());
        }

    }

    private boolean isValid(String day) {
        for(Days element: Days.values()){
            if (element.name().equals(day)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String value() {
        return this.day.name();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Day day1 = (Day) o;
        return day == day1.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(day);
    }
}
