package org.heikegani.training.group.values;

import co.com.sofka.domain.generic.Identity;

public class LocationId extends Identity {
    public LocationId() {
        super();
    }
    public LocationId(String id) {
        super(id);
    }
    public static LocationId of(String id){
        return  new LocationId(id);
    }
}
