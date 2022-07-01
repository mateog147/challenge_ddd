package org.heikegani.training.session.commands;

import co.com.sofka.domain.generic.Command;
import org.heikegani.training.session.values.Focus;

public class UpdateSessionFocus extends Command {
    private final Focus focus;

    public UpdateSessionFocus(Focus focus) {
        this.focus = focus;
    }

    public Focus getFocus() {
        return focus;
    }
}
