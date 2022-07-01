package org.heikegani.training.session;

import co.com.sofka.domain.generic.AggregateEvent;
import org.heikegani.training.group.values.GroupId;
import org.heikegani.training.sensei.values.SenseiId;
import org.heikegani.training.session.values.SessionId;

public class Session extends AggregateEvent<SessionId> {
    protected GroupId groupId;
    protected SenseiId senseiId;
    protected List list;
    protected Feedback feedback;
    protected  Schema schema;

    public Session(SessionId entityId,GroupId groupId) {
        super(entityId);
        appendChange(new SessionCreated()).apply();
    }

    private Session(SessionId entityId) {
        super(entityId);
    }
}
