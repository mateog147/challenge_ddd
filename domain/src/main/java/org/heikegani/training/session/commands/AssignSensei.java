package org.heikegani.training.session.commands;

import co.com.sofka.domain.generic.Command;
import org.heikegani.training.sensei.values.SenseiId;

public class AssignSensei extends Command {
    private final SenseiId senseiId;

    public AssignSensei(SenseiId senseiId) {
        this.senseiId = senseiId;
    }

    public SenseiId getSenseiId() {
        return senseiId;
    }
}
