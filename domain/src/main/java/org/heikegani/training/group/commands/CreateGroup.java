package org.heikegani.training.group.commands;

import co.com.sofka.domain.generic.Command;
import org.heikegani.training.group.Location;
import org.heikegani.training.group.values.GroupId;
import org.heikegani.training.group.values.JudokaId;
import org.heikegani.training.group.values.Name;

public class CreateGroup extends Command {


    private final GroupId groupId;
    private final Location location;

    public CreateGroup(GroupId groupId, Location location) {
        this.groupId = groupId;
        this.location = location;
    }

    public GroupId getGroupId() {
        return groupId;
    }

    public Location getLocation() {
        return location;
    }
}
