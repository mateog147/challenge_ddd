package org.heikegani.training.group.commands;

import co.com.sofka.domain.generic.Command;
import org.heikegani.training.group.values.GroupId;
import org.heikegani.training.group.values.StartHour;

public class AssignStartHour extends Command {

    private final GroupId groupId;
    private final StartHour startHour;

    public AssignStartHour(GroupId groupId, StartHour startHour) {
        this.groupId = groupId;
        this.startHour = startHour;
    }

    public StartHour getStartHour() {
        return startHour;
    }

    public GroupId getGroupId() {
        return groupId;
    }
}
