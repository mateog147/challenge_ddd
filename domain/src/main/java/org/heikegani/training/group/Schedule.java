package org.heikegani.training.group;

import co.com.sofka.domain.generic.Entity;
import org.heikegani.training.group.values.Day;
import org.heikegani.training.group.values.ScheduleId;
import org.heikegani.training.group.values.StartHour;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Schedule extends Entity<ScheduleId> {
    private StartHour startHour;
    private Set<Day> days;

    public Schedule(ScheduleId entityId) {
        super(entityId);
        this.days = new HashSet<>();
    }

    public void changeStartHour(StartHour startHour){

        this.startHour = Objects.requireNonNull(startHour);
    }

    public void addDay(Day newDay){
        this.days.add(Objects.requireNonNull(newDay));
    }

    public StartHour startHour() {
        return startHour;
    }

    public Set<Day> days() {
        return days;
    }
}
