package org.heikegani.training.session;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import org.heikegani.training.group.values.GroupId;
import org.heikegani.training.sensei.Sensei;
import org.heikegani.training.sensei.SenseiChange;
import org.heikegani.training.sensei.values.SenseiId;
import org.heikegani.training.session.events.*;
import org.heikegani.training.session.values.*;

public class Session extends AggregateEvent<SessionId> {
    protected GroupId groupId;
    protected SenseiId senseiId;
    protected List list;
    protected Feedback feedback;
    protected  Schema schema;

    public Session(SessionId entityId,GroupId groupId, SchemaId schemaId, Intensity intensity, ListId listId ) {
        super(entityId);
        appendChange(new SessionCreated(groupId, schemaId, intensity, listId)).apply();
    }

    private Session(SessionId entityId) {

        super(entityId);
        subscribe(new SessionChange(this));

    }

    public static Session from(SessionId senseiId, java.util.List<DomainEvent> events){
        var session = new Session(senseiId);
        events.forEach(session::applyEvent);
        return session;
    }


    public void addNewAttendee(Attendee newAttendee){
        appendChange(new AttendeeAdded(newAttendee)).apply();
    }

    public void assignSensei(SenseiId senseiId){
        appendChange(new SenseiAssigned(senseiId)).apply();
    }

    public void addSenseiComment(Comment newComment){
        appendChange(new CommentAdded(newComment)).apply();
    }

    public void updateSessionFocus(Focus focus){
        appendChange(new FocusUpdated(focus)).apply();
    }

    public void changeSessionIntesity(Intensity intensity){
        appendChange(new IntensityChanged(intensity)).apply();
    }

}
