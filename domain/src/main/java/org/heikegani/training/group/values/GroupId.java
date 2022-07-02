package org.heikegani.training.group.values;

import co.com.sofka.domain.generic.Identity;

public class GroupId extends Identity {

    public GroupId() {}

    private GroupId(String id) {
        super(id);
    }


    public static GroupId of(String id){
        return  new GroupId(id);
    }
}
