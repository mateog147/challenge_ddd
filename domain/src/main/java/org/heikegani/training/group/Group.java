package org.heikegani.training.group;

import co.com.sofka.domain.generic.AggregateEvent;
import org.heikegani.training.group.events.*;
import org.heikegani.training.group.values.*;

import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Group extends AggregateEvent<GroupId> {
    protected Set<Judoka> judokas;
    protected Location location;
    protected Schedule schedule;

    public Group(GroupId entityId, Location location) {
        super(entityId);
        appendChange(new GroupCreated(location)).apply();
    }

    public void addJudoka(JudokaId judokaId, Name name){
        Objects.requireNonNull(judokaId);
        Objects.requireNonNull(name);

        appendChange(new JudokaAdded(judokaId, name)).apply();
    }

    public void updateLocation(LocationId entityId,City city, Place place){
        appendChange(new LocationUpdated(entityId,city, place)).apply();
    }

    public void assignStartHour(StartHour newStartHour){
        appendChange(new StartHourAssigned(newStartHour)).apply();
    }

    public void addTrainingDay(Day newDay){
        appendChange(new TrainingDayAdded(newDay)).apply();
    }

    public void beltPromotion(Set<JudokaId> judokaIds){
        appendChange(new BeltPromotionDone(judokaIds)).apply();
    }

    public Set<Judoka> judokas() {
        return judokas;
    }

    public Location location() {
        return location;
    }

    public Schedule schedule() {
        return schedule;
    }

    public Optional<Judoka> getJudokaById(JudokaId id){
        return judokas.stream().filter(judoka -> judoka.identity().equals(id)).findFirst();
    }
}
