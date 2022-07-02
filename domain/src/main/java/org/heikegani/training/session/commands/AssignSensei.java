package org.heikegani.training.session.commands;

import co.com.sofka.domain.generic.Command;
import org.heikegani.training.sensei.values.SenseiId;
import org.heikegani.training.session.values.SessionId;

public class AssignSensei extends Command {

    private final SessionId entityId;
    private final SenseiId senseiId;

    public AssignSensei(SessionId entityId, SenseiId senseiId) {
        this.entityId = entityId;
        this.senseiId = senseiId;
    }

    public SessionId getEntityId() {
        return entityId;
    }

    public SenseiId getSenseiId() {
        return senseiId;
    }
}
