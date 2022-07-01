package org.heikegani.training.group.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.heikegani.training.group.values.JudokaId;
import org.heikegani.training.group.values.Name;

public class JudokaAdded extends DomainEvent {
    private final Name name;
    private final JudokaId judokaId;

    public JudokaAdded(JudokaId entityId, Name name) {
        super("heikegani.group.judokaadded");
        this.judokaId = entityId;
        this.name = name;
    }

    public Name getName() {
        return name;
    }

    public JudokaId getJudokaId() {
        return judokaId;
    }
}
