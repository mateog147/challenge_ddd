package org.heikegani.training.session.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.heikegani.training.sensei.values.SenseiId;

public class SenseiAssigned extends DomainEvent {
    private final SenseiId senseiId;

    public SenseiAssigned(SenseiId senseiId) {
        super("heikegani.session.senserassigned");
        this.senseiId = senseiId;
    }

    public SenseiId getSenseiId() {
        return senseiId;
    }
}
