package org.heikegani.training.session.commands;

import co.com.sofka.domain.generic.Command;
import org.heikegani.training.session.values.Attendee;
import org.heikegani.training.session.values.SessionId;

public class AddNewAttendee extends Command {
    private final SessionId entityId;
    private final Attendee newAttendee;

    public AddNewAttendee(SessionId entityId, Attendee newAttendee) {
        this.entityId = entityId;
        this.newAttendee = newAttendee;
    }

    public SessionId getEntityId() {
        return entityId;
    }

    public Attendee getNewAttendee() {
        return newAttendee;
    }
}
