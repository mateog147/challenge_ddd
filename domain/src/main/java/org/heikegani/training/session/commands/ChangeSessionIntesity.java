package org.heikegani.training.session.commands;

import co.com.sofka.domain.generic.Command;
import org.heikegani.training.session.values.Intensity;

public class ChangeSessionIntesity extends Command {
    private final Intensity intensity;


    public ChangeSessionIntesity(Intensity intensity) {
        this.intensity = intensity;
    }

    public Intensity getIntensity() {
        return intensity;
    }
}
