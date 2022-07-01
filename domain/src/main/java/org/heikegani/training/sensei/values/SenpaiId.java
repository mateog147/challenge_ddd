package org.heikegani.training.sensei.values;

import co.com.sofka.domain.generic.Identity;

public class SenpaiId extends Identity {
    private SenpaiId(String uuid) {
        super(uuid);
    }

    public SenpaiId() {
    }

    public SenpaiId of(String id){
        return new SenpaiId(id);
    }

}
