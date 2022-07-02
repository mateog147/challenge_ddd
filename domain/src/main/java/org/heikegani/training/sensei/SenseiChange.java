package org.heikegani.training.sensei;

import co.com.sofka.domain.generic.EventChange;
import org.heikegani.training.sensei.events.*;

public class SenseiChange extends EventChange {
    public SenseiChange(Sensei sensei) {
        apply((SenseiCreated event)->{
            sensei.name = event.getName();
            sensei.senpai = null;
            sensei.profile = new Profile(event.getProfileId());
            sensei.equipment = new Equipment(event.getEquipmentId());
        });
        
        apply((RankChanged event)->{
            sensei.rank = event.getRank();
        });

        apply((SenpaiAssigned event)->{
            sensei.senpai = event.getSenpai();
        });

        apply((CourseAdded event) ->{
           sensei.profile.addCourse(event.getCourse());
        });

        apply((ToolAssigned event)->{
            sensei.equipment.addTool(event.getNewTool());
        });

    }
}
