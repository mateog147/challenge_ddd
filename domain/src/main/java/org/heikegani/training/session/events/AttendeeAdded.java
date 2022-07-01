package org.heikegani.training.session.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.heikegani.training.session.values.Attendee;

public class AttendeeAdded extends DomainEvent {
    private final Attendee attendee;

    public AttendeeAdded(Attendee newAttendee) {
        super("heikegani.session.attendeeadded");
        this.attendee = newAttendee;
    }

    public Attendee getAttendee() {
        return attendee;
    }
}
