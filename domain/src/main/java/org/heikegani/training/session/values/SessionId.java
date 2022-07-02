package org.heikegani.training.session.values;

import co.com.sofka.domain.generic.Identity;

public class SessionId extends Identity {

    private SessionId(String uuid) {
        super(uuid);
    }

    public SessionId() {
    }

    public static SessionId of(String id){
        return new SessionId(id);
    }
}
