package org.heikegani.training.session.commands;

import co.com.sofka.domain.generic.Command;
import org.heikegani.training.session.values.Intensity;
import org.heikegani.training.session.values.SessionId;

public class ChangeSessionIntesity extends Command {
    private final SessionId entityId;
    private final Intensity intensity;


    public ChangeSessionIntesity(SessionId entityId, Intensity intensity) {
        this.entityId = entityId;
        this.intensity = intensity;
    }

    public Intensity getIntensity() {
        return intensity;
    }

    public SessionId getEntityId() {
        return entityId;
    }
}
