package org.heikegani.training.session;

import co.com.sofka.domain.generic.Entity;
import org.heikegani.training.session.values.Attendee;
import org.heikegani.training.session.values.ListId;
import org.heikegani.training.session.values.Turnout;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class List extends Entity<ListId> {
    private Turnout turnout;
    private Set<Attendee> attendees;


    public List(ListId entityId) {
        super(entityId);
        this.turnout = new Turnout();
        this.attendees = new HashSet<>();
    }

    public void addAttendee(Attendee attendee){
        Objects.requireNonNull(attendee);
        this.attendees.add(attendee);
        this.turnout = turnout.addOne();
    }

    public Turnout turnout() {
        return turnout;
    }

    public Set<Attendee> attendees() {
        return attendees;
    }
}
