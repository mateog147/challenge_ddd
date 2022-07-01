package org.heikegani.training.group.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.heikegani.training.group.values.Day;

public class TrainingDayAdded extends DomainEvent {
    private final Day day;

    public TrainingDayAdded(Day newDay) {
        super("heikegani.group.trainingdayadded");
        this.day = newDay;
    }

    public Day getDay() {
        return day;
    }
}
