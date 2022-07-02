package org.heikegani.training.group.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.heikegani.training.group.Judoka;
import org.heikegani.training.group.Location;
import org.heikegani.training.group.Schedule;
import org.heikegani.training.group.values.ScheduleId;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


public class GroupCreated extends DomainEvent {
    private final Set<Judoka> judokas;
    private final Location location;
    private final ScheduleId scheduleId;
    //private final
    public GroupCreated(Location location, ScheduleId scheduleId) {
        super("heikegani.group.groupcreated");
        this.judokas = new HashSet<>();
        this.location = location;
        this.scheduleId = Objects.requireNonNull(scheduleId);
    }

    public Set<Judoka> getJudokas() {
        return judokas;
    }

    public Location getLocation() {
        return location;
    }

    public ScheduleId getScheduleId() {
        return scheduleId;
    }
}
