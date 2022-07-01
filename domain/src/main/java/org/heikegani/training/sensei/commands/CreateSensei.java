package org.heikegani.training.sensei.commands;

import co.com.sofka.domain.generic.Command;
import org.heikegani.training.group.values.Name;
import org.heikegani.training.sensei.values.SenseiId;

public class CreateSensei extends Command {
    private final SenseiId entityId;
    private final Name name;

    public CreateSensei(SenseiId entityId, Name name) {
        this.entityId = entityId;
        this.name = name;
    }

    public SenseiId getEntityId() {
        return entityId;
    }

    public Name getName() {
        return name;
    }
}
