package org.heikegani.training.session.commands;

import co.com.sofka.domain.generic.Command;
import org.heikegani.training.session.values.Focus;
import org.heikegani.training.session.values.SessionId;

public class UpdateSessionFocus extends Command {
    private final SessionId entityId;
    private final Focus focus;

    public UpdateSessionFocus(SessionId entityId, Focus focus) {
        this.entityId = entityId;
        this.focus = focus;
    }

    public Focus getFocus() {
        return focus;
    }

    public SessionId getEntityId() {
        return entityId;
    }
}
