package org.heikegani.training.sensei.commands;

import co.com.sofka.domain.generic.Command;
import org.heikegani.training.group.values.Rank;

public class ChangeRank extends Command {
    private final Rank newRank;

    public ChangeRank(Rank newRank) {
        this.newRank = newRank;
    }

    public Rank getNewRank() {
        return newRank;
    }
}
