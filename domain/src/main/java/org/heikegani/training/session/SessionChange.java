package org.heikegani.training.session;

import co.com.sofka.domain.generic.EventChange;
import org.heikegani.training.session.events.*;

public class SessionChange extends EventChange {
    public SessionChange(Session session) {
        apply((SessionCreated event)->{
            session.groupId =  event.getGroupId();
            session.schema = new Schema(event.getSchemaId(),event.getIntensity());
            session.list = new List(event.getListId());
        });

        apply((SenseiAssigned event)->{
            session.senseiId = event.getSenseiId();
        });

        apply((IntensityChanged event) ->{
            session.schema.setIntensity(event.getIntensity());
        });

        apply((FocusUpdated event)->{
            session.schema.setFocus(event.getFocus());
        });

        apply((CommentAdded event)->{
            session.feedback.addComment(event.getComment());
        });

        apply((AttendeeAdded event)->{
            session.list.addAttendee(event.getAttendee());
        });
    }
}
