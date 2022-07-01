package org.heikegani.training.group.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Rank implements ValueObject<String> {
    private final ArrayList<String> ranks= new ArrayList<String>(Arrays.asList("BLANCO","AMARILLO","NARANJA","VERDE", "AZUL", "MARRON", "NEGRO"));
    private String rank;

    public Rank(String rank) {

        try {
            if(rank.isBlank()){
                throw new IllegalArgumentException("Rank provided is not valid");
            }
            String _rank= rank.toUpperCase();

            if(!isValid(_rank)){
                throw new IllegalArgumentException("Rank provided is not valid");
            }
            this.rank = _rank;

        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage());
        }

    }

    private boolean isValid(String rank) {
        for(String element: ranks){
            if (element.equals(rank)){
                return true;
            }
        }
        return false;
    }

    public Rank nextRank(){
        Integer current = ranks.indexOf(this.rank);
        if(current < ranks.size()){
            return new Rank(ranks.get(current+1));
        }
        return new Rank(ranks.get(current));
    }

    @Override
    public String value() {
        return this.rank;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rank rank1 = (Rank) o;
        return rank == rank1.rank;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rank);
    }
}
