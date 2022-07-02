package org.heikegani.training.sensei.values;

import co.com.sofka.domain.generic.Identity;

public class ProfileId extends Identity {
    private ProfileId(String uuid) {
        super(uuid);
    }

    public ProfileId() {
    }

    public static ProfileId of(String id){
        return new ProfileId(id);
    }
}
