package org.heikegani.training.sensei;

import co.com.sofka.domain.generic.Entity;
import org.heikegani.training.group.values.Name;
import org.heikegani.training.group.values.Rank;
import org.heikegani.training.sensei.values.SenpaiId;

import java.util.Objects;

public class Senpai extends Entity<SenpaiId> {
    private Name name;
    private Rank rank;


    public Senpai(SenpaiId entityId, Name name, Rank rank) {
        super(entityId);
        this.name = Objects.requireNonNull(name);
        this.rank = Objects.requireNonNull(rank);
    }

    public Name name() {
        return name;
    }

    public Rank rank() {
        return rank;
    }

    public  void changeRank(String newRank){
        this.rank = new Rank(newRank);
    }
}
