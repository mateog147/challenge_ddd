package org.heikegani.training.session;

import co.com.sofka.domain.generic.AggregateEvent;
import org.heikegani.training.group.values.GroupId;
import org.heikegani.training.sensei.values.SenseiId;
import org.heikegani.training.session.events.*;
import org.heikegani.training.session.values.*;

public class Session extends AggregateEvent<SessionId> {
    protected GroupId groupId;
    protected SenseiId senseiId;
    protected List list;
    protected Feedback feedback;
    protected  Schema schema;

    public Session(SessionId entityId,GroupId groupId) {
        super(entityId);
        appendChange(new SessionCreated(groupId)).apply();
    }

    private Session(SessionId entityId) {
        super(entityId);
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
