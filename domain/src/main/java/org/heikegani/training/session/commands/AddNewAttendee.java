package org.heikegani.training.session.commands;

import co.com.sofka.domain.generic.Command;
import org.heikegani.training.session.values.Attendee;

public class AddNewAttendee extends Command {
    private final Attendee newAttendee;

    public AddNewAttendee(Attendee newAttendee) {
        this.newAttendee = newAttendee;
    }

    public Attendee getNewAttendee() {
        return newAttendee;
    }
}
