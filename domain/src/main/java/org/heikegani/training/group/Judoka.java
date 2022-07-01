package org.heikegani.training.group;

import co.com.sofka.domain.generic.Entity;
import org.heikegani.training.group.values.BirthDay;
import org.heikegani.training.group.values.JudokaId;
import org.heikegani.training.group.values.Name;
import org.heikegani.training.group.values.Rank;

import java.util.Objects;

public class Judoka extends Entity<JudokaId> {
    private Name name;
    private Rank rank;
    private BirthDay birthDay;

    //Constructor
    public Judoka(JudokaId entityId, Name name) {
        super(entityId);
        this.name = name;
    }

    //Comportamientos
    public void setBirthDay(BirthDay birthDay){
        this.birthDay = Objects.requireNonNull(birthDay);
    }

    public void changeRank(Rank newRank){
        this.rank = Objects.requireNonNull(newRank);
    }

    //Getters
    public Name name() {
        return name;
    }

    public Rank rank() {
        return rank;
    }

    public BirthDay birthDay() {
        return birthDay;
    }
}
