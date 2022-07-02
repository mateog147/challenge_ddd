package org.heikegani.training.session.values;

import co.com.sofka.domain.generic.Identity;

public class SchemaId extends Identity {
    private  SchemaId(String uuid) {
        super(uuid);
    }

    public SchemaId() {
    }

    public static SchemaId of(String id){
        return new SchemaId(id);
    }
}
