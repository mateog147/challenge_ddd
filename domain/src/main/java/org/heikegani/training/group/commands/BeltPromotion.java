package org.heikegani.training.group.commands;

import co.com.sofka.domain.generic.Command;
import org.heikegani.training.group.values.JudokaId;

import java.util.Set;

public class BeltPromotion extends Command {
    private final Set<JudokaId> judokaIds;

    public BeltPromotion(Set<JudokaId> judokaIds) {
        this.judokaIds = judokaIds;
    }

    public Set<JudokaId> getJudokaIds() {
        return judokaIds;
    }
}
