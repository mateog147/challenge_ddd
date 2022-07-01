package org.heikegani.training.group.values;

import co.com.sofka.domain.generic.Identity;

public class ScheduleId extends Identity {

    public ScheduleId(String id) {
        super(id);
    }
    public static ScheduleId of(String id){
        return  new ScheduleId(id);
    }
}
