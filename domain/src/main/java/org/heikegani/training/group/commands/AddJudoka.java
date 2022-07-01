package org.heikegani.training.group.commands;

import co.com.sofka.domain.generic.Command;
import org.heikegani.training.group.values.JudokaId;
import org.heikegani.training.group.values.Name;

public class AddJudoka extends Command {

    private final JudokaId judokaId;
    private final Name name;

    public AddJudoka(JudokaId judokaId, Name name) {
        this.judokaId = judokaId;
        this.name = name;
    }

    public JudokaId getJudokaId() {
        return judokaId;
    }

    public Name getName() {
        return name;
    }
}
