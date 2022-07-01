package org.heikegani.training.group.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.heikegani.training.group.values.StartHour;

public class StartHourAssigned extends DomainEvent {
    private final int hour;
    private final int minutes;

    public StartHourAssigned(int hour, int minutes) {
        super("heikegani.group.starthourassigned");
        this.hour = hour;
        this.minutes = minutes;
    }

    public int getHour() {
        return hour;
    }

    public int getMinutes() {
        return minutes;
    }
}
