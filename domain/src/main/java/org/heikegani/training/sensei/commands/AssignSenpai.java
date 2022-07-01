package org.heikegani.training.sensei.commands;

import co.com.sofka.domain.generic.Command;
import org.heikegani.training.sensei.Senpai;

public class AssignSenpai extends Command {
    private final Senpai senpai;

    public AssignSenpai(Senpai senpai) {
        this.senpai = senpai;
    }

    public Senpai getSenpai() {
        return senpai;
    }
}
