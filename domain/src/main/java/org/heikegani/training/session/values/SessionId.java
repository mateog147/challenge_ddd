package org.heikegani.training.session.values;

import co.com.sofka.domain.generic.Identity;

public class SessionId extends Identity {

    public SessionId(String uuid) {
        super(uuid);
    }

    public SessionId() {
    }
}
