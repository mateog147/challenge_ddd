package org.heikegani.training.sensei.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.heikegani.training.group.values.Name;

public class SenseiCreated extends DomainEvent {
    private final Name name;

    public SenseiCreated(Name name) {
        super("heikegani.sensei.senseicreated");
        this.name = name;
    }

    public Name getName() {
        return name;
    }
}
