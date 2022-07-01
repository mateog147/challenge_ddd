package org.heikegani.training.sensei.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.heikegani.training.group.values.Rank;

public class RankChanged extends DomainEvent {
    private final Rank rank;

    public RankChanged(Rank newRank) {
        super("heikegani.sensei.rankchanged");
        this.rank = newRank;
    }

    public Rank getRank() {
        return rank;
    }
}
