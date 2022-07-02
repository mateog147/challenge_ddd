package org.heikegani.training.sensei.commands;

import co.com.sofka.domain.generic.Command;
import org.heikegani.training.group.values.Rank;
import org.heikegani.training.sensei.values.SenseiId;

public class ChangeRank extends Command {
    private final SenseiId senseiId;
    private final Rank newRank;

    public ChangeRank(SenseiId senseiId, Rank newRank) {
        this.senseiId = senseiId;
        this.newRank = newRank;
    }

    public SenseiId getSenseiId() {
        return senseiId;
    }

    public Rank getNewRank() {
        return newRank;
    }
}
