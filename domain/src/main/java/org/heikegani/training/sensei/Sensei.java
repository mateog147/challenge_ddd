package org.heikegani.training.sensei;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import org.heikegani.training.group.values.Name;
import org.heikegani.training.group.values.Rank;
import org.heikegani.training.sensei.events.*;
import org.heikegani.training.sensei.values.*;

import java.util.List;
import java.util.Objects;

public class Sensei extends AggregateEvent<SenseiId> {
    protected Name name;
    protected Rank rank;
    protected Senpai senpai;
    protected Profile profile;
    protected Equipment equipment;

    public Sensei(SenseiId entityId, Name name,  ProfileId profileId, EquipmentId equipmentId) {
        super(entityId);
        Objects.requireNonNull(name);
        appendChange(new SenseiCreated(name,  profileId, equipmentId)).apply();
    }

    private Sensei(SenseiId entityId){
        super(entityId);
        subscribe(new SenseiChange(this));
    }

    public static Sensei from(SenseiId senseiId, List<DomainEvent> events){
        var sensei = new Sensei(senseiId);
        events.forEach(sensei::applyEvent);
        return sensei;
    }

    public void changeRank(Rank newRank){
        appendChange(new RankChanged(newRank)).apply();
    }

    public void assignSenpai(Senpai senpai){
        appendChange(new SenpaiAssigned(senpai)).apply();
    }

    public void assignTool(Tool tool){
        appendChange(new ToolAssigned(tool)).apply();
    }

    public void addCourse(Course newCourse){
        appendChange(new CourseAdded(newCourse)).apply();
    }


}
