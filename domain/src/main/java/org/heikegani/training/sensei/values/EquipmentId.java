package org.heikegani.training.sensei.values;

import co.com.sofka.domain.generic.Identity;

public class EquipmentId extends Identity {
    private EquipmentId(String uuid) {
        super(uuid);
    }

    public EquipmentId() {
    }

    public static EquipmentId of(String id){
        return new EquipmentId(id);
    }
}
