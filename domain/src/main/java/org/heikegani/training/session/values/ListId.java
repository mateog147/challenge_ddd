package org.heikegani.training.session.values;

import co.com.sofka.domain.generic.Identity;

public class ListId extends Identity {
    private ListId(String uuid) {
        super(uuid);
    }

    public ListId() {
    }

    public static ListId of(String id){
        return new ListId(id);
    }
}
