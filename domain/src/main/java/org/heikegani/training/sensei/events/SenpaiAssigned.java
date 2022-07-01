package org.heikegani.training.sensei.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.heikegani.training.sensei.Senpai;

public class SenpaiAssigned extends DomainEvent {
    private final Senpai senpai;

    public SenpaiAssigned(Senpai senpai) {
        super("heikegani.sensei.senpaiassigned");
        this.senpai = senpai;
    }

    public Senpai getSenpai() {
        return senpai;
    }
}
