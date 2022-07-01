package org.heikegani.training.group.values;

import co.com.sofka.domain.generic.ValueObject;

public class Rank implements ValueObject<String> {
    private enum Ranks{BLANCO, AMARILLO, NARANJA, VERDE, AZUL, MARRON, NEGRO};
    private Ranks rank;

    public Rank(String rank) {

        try {
            if(rank.isBlank()){
                throw new IllegalArgumentException("Rank provided is not valid");
            }
            String _rank= rank.toUpperCase();

            if(!isValid(_rank)){
                throw new IllegalArgumentException("Rank provided is not valid");
            }
            this.rank = Ranks.valueOf(_rank);

        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage());
        }

    }

    private boolean isValid(String rank) {
        for(Ranks element: Ranks.values()){
            if (element.name().equals(rank)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String value() {
        return this.rank.name();
    }
}
