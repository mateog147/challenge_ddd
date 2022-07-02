package org.heikegani.training.group.commands;

import co.com.sofka.domain.generic.Command;
import org.heikegani.training.group.values.Day;
import org.heikegani.training.group.values.GroupId;

public class AddTrainingDay extends Command {
    private final GroupId groupId;
    private final Day day;

    public AddTrainingDay(GroupId groupId, Day newDay) {
        this.groupId = groupId;
        this.day = newDay;
    }

    public Day getDay() {
        return day;
    }

    public GroupId getGroupId() {
        return groupId;
    }
}
