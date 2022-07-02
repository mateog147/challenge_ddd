package org.heikegani.training.sensei.commands;

import co.com.sofka.domain.generic.Command;
import org.heikegani.training.group.values.Name;
import org.heikegani.training.sensei.values.EquipmentId;
import org.heikegani.training.sensei.values.ProfileId;
import org.heikegani.training.sensei.values.SenpaiId;
import org.heikegani.training.sensei.values.SenseiId;

public class CreateSensei extends Command {
    private final SenseiId entityId;
    private final Name name;

    private final ProfileId profileId;
    private final EquipmentId equipmentId;


    public CreateSensei(SenseiId entityId, Name name,  ProfileId profileId, EquipmentId equipmentId) {
        this.entityId = entityId;
        this.name = name;
        this.profileId = profileId;
        this.equipmentId = equipmentId;
    }

    public SenseiId getEntityId() {
        return entityId;
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
