package org.heikegani.training.group.values;

import co.com.sofka.domain.generic.ValueObject;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class BirthDay implements ValueObject<String> {
    private final LocalDate date;
    private final String format;

    public BirthDay(int day, int month, int year) {
        try {
            this.date = LocalDate.of(year, month, day);
            if(date.isAfter(LocalDate.now())){
                throw new IllegalArgumentException("Birth day no valid - must be in the past");
            }

        } catch (Exception e) {
            throw new IllegalArgumentException(e.getMessage());
        }
        this.format = generateFormat();
    }

    private String generateFormat() {
        return this.date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }

    //Se retorna el valor esperado, en este caso la fecha con el formato dado.
    @Override
    public String value() {
        return this.format;
    }

    //Se sobrescribe el método hashCode para extraer el valor de las propiedades finales del objeto de valor
    @Override
    public int hashCode() {
        return Objects.hash(this.format);
    }

    //Se sobrescribe el método equals para comparar los valores del objeto (un objeto de valor es igual cuando sus propiedades son iguales).
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        BirthDay castObj = (BirthDay) obj;
        return Objects.equals(format, castObj.format);
    }
}
