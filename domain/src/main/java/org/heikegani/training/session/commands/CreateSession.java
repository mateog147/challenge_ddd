package org.heikegani.training.session.commands;

import co.com.sofka.domain.generic.Command;
import org.heikegani.training.group.values.GroupId;
import org.heikegani.training.session.values.SessionId;

public class CreateSession extends Command {

    private final GroupId groupId;
    private final SessionId entityId;

    public CreateSession(GroupId groupId, SessionId entityId) {
        this.groupId = groupId;
        this.entityId = entityId;
    }

    public GroupId getGroupId() {
        return groupId;
    }

    public SessionId getEntityId() {
        return entityId;
    }
}
