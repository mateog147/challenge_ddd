package org.heikegani.training.group.commands;

import co.com.sofka.domain.generic.Command;
import org.heikegani.training.group.Location;
import org.heikegani.training.group.values.GroupId;
import org.heikegani.training.group.values.JudokaId;
import org.heikegani.training.group.values.Name;
import org.heikegani.training.group.values.ScheduleId;

public class CreateGroup extends Command {


    private final GroupId groupId;
    private final Location location;
    private final ScheduleId scheduleId;

    public CreateGroup(GroupId groupId, Location location, ScheduleId scheduleId) {
        this.groupId = groupId;
        this.location = location;
        this.scheduleId = scheduleId;
    }

    public GroupId getGroupId() {
        return groupId;
    }

    public Location getLocation() {
        return location;
    }

    public ScheduleId getScheduleId() {
        return scheduleId;
    }
}
