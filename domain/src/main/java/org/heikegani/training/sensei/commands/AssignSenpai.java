package org.heikegani.training.sensei.commands;

import co.com.sofka.domain.generic.Command;
import org.heikegani.training.sensei.Senpai;
import org.heikegani.training.sensei.values.SenseiId;

public class AssignSenpai extends Command {
    private final SenseiId senseiId;
    private final Senpai senpai;

    public AssignSenpai(SenseiId senseiId, Senpai senpai) {
        this.senseiId = senseiId;
        this.senpai = senpai;
    }

    public SenseiId getSenseiId() {
        return senseiId;
    }

    public Senpai getSenpai() {
        return senpai;
    }
}
