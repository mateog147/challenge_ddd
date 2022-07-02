package org.heikegani.training.sensei.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.heikegani.training.group.values.Name;
import org.heikegani.training.sensei.values.EquipmentId;
import org.heikegani.training.sensei.values.ProfileId;
import org.heikegani.training.sensei.values.SenpaiId;

public class SenseiCreated extends DomainEvent {
    private final Name name;
    private final ProfileId profileId;
    private final EquipmentId equipmentId;

    public SenseiCreated(Name name,  ProfileId profileId, EquipmentId equipmentId) {
        super("heikegani.sensei.senseicreated");
        this.name = name;
        this.profileId = profileId;
        this.equipmentId = equipmentId;
    }


    public ProfileId getProfileId() {
        return profileId;
    }

    public EquipmentId getEquipmentId() {
        return equipmentId;
    }

    public Name getName() {
        return name;
    }
}
