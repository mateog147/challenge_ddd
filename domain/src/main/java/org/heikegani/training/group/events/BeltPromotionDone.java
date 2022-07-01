package org.heikegani.training.group.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.heikegani.training.group.values.JudokaId;

import java.util.Set;

public class BeltPromotionDone extends DomainEvent {
    private final Set<JudokaId> promoted;

    public BeltPromotionDone(Set<JudokaId> judokaIds) {
        super("heikegani.group.beltpromotiondone");
        this.promoted = judokaIds;
    }

    public Set<JudokaId> getPromoted() {
        return promoted;
    }
}
