package org.heikegani.training.sensei.values;

import co.com.sofka.domain.generic.Identity;

public class SenseiId extends Identity {
    private SenseiId(String uuid) {
        super(uuid);
    }

    public SenseiId() {
    }

    public static SenseiId of(String id){
        return new SenseiId(id);
    }
}
