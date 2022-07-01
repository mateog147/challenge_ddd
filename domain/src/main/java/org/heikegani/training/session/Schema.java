package org.heikegani.training.session;

import co.com.sofka.domain.generic.Entity;
import org.heikegani.training.session.values.Focus;
import org.heikegani.training.session.values.Intensity;
import org.heikegani.training.session.values.SchemaId;

import java.util.Objects;

public class Schema extends Entity<SchemaId> {
    private Intensity intensity;
    private Focus focus;

    public Schema(SchemaId entityId, Intensity intensity) {
        super(entityId);
        this.intensity = Objects.requireNonNull(intensity);
    }

    public void setIntensity(Intensity intensity){
        this.intensity = Objects.requireNonNull(intensity);
    }

    public void setFocus(Focus focus){
        this.focus = Objects.requireNonNull(focus);
    }

    public Intensity intensity() {
        return intensity;
    }

    public Focus focus() {
        return focus;
    }
}
