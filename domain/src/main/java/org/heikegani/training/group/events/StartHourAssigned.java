package org.heikegani.training.group.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.heikegani.training.group.values.StartHour;

public class StartHourAssigned extends DomainEvent {
    private final StartHour startHour;


    public StartHourAssigned(StartHour startHour) {
        super("heikegani.group.starthourassigned");
        this.startHour = startHour;
    }

    public StartHour getStartHour() {
        return startHour;
    }
}
