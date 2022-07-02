package org.heikegani.training.group.commands;

import co.com.sofka.domain.generic.Command;
import org.heikegani.training.group.values.GroupId;
import org.heikegani.training.group.values.JudokaId;

import java.util.Set;

public class BeltPromotion extends Command {

    private final GroupId groupId;
    private final Set<JudokaId> judokaIds;

    public BeltPromotion(GroupId groupId, Set<JudokaId> judokaIds) {
        this.groupId = groupId;
        this.judokaIds = judokaIds;
    }

    public GroupId getGroupId() {
        return groupId;
    }

    public Set<JudokaId> getJudokaIds() {
        return judokaIds;
    }
}
