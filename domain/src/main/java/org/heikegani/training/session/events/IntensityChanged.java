package org.heikegani.training.session.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.heikegani.training.session.values.Intensity;

public class IntensityChanged extends DomainEvent {
    private final Intensity intensity;

    public IntensityChanged(Intensity intensity) {
        super("heikegani.session.intensitychanged");
        this.intensity = intensity;
    }

    public Intensity getIntensity() {
        return intensity;
    }
}
