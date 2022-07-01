package org.heikegani.training.sensei;

import co.com.sofka.domain.generic.AggregateEvent;
import org.heikegani.training.group.values.Name;
import org.heikegani.training.group.values.Rank;
import org.heikegani.training.sensei.values.SenseiId;

import java.util.Objects;

public class Sensei extends AggregateEvent<SenseiId> {
    protected Name name;
    protected Rank rank;
    protected Senpai senpai;
    protected Profile profile;
    protected Equipment equipment;

    public Sensei(SenseiId entityId, Name name) {
        super(entityId);
        Objects.requireNonNull(name);
        appendChange(new SenseiCreated(name)).apply();
    }
}
