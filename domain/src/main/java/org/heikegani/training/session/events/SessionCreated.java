package org.heikegani.training.session.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.heikegani.training.group.values.GroupId;

public class SessionCreated extends DomainEvent {
    private final GroupId groupId;

    public SessionCreated(GroupId groupId) {
        super("heikegani.session.sessioncreated");
        this.groupId = groupId;
    }

    public GroupId getGroupId() {
        return groupId;
    }
}
