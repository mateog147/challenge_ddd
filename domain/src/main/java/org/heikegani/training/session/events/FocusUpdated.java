package org.heikegani.training.session.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.heikegani.training.session.values.Focus;

public class FocusUpdated extends DomainEvent {
    private final Focus focus;

    public FocusUpdated(Focus focus) {
        super("heikegani.session.focusupdated");
        this.focus = focus;
    }

    public Focus getFocus() {
        return focus;
    }
}
