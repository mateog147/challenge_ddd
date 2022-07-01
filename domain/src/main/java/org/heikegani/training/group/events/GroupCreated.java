package org.heikegani.training.group.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.heikegani.training.group.Judoka;
import org.heikegani.training.group.Location;

import java.util.HashSet;
import java.util.Set;


public class GroupCreated extends DomainEvent {
    private final Set<Judoka> judokas;
    private final Location location;
    //private final
    public GroupCreated(Location location) {
        super("heikegani.group.groupcreated");
        this.judokas = new HashSet<>();
        this.location = location;
    }

    public Set<Judoka> getJudokas() {
        return judokas;
    }

    public Location getLocation() {
        return location;
    }
}
