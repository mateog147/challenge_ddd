package org.heikegani.training.group;

import co.com.sofka.domain.generic.EventChange;
import org.heikegani.training.group.events.*;

import java.util.HashSet;

public class GroupChange extends EventChange {
    public GroupChange(Group group) {

        apply((GroupCreated event) ->{
            group.location = event.getLocation();
            group.judokas = new HashSet<>();
        });

        apply((JudokaAdded event)->{
            group.judokas.add(new Judoka(event.getJudokaId(),event.getName()));
        });

        apply((LocationUpdated event)->{
            group.location.chageCity(event.getCity());
            group.location.changePlace(event.getPlace());
        });

        apply((StartHourAssigned event) ->{
            group.schedule.changeStartHour(event.getHour(), event.getMinutes());
        });

        apply((TrainingDayAdded event) -> {
            group.schedule.addDay(event.getDay());
        });

        apply((BeltPromotionDone event) ->{
            for(Judoka judoka: group.judokas()){
                if(event.getPromoted().contains(judoka.identity())){
                    judoka.changeRank();
                }
            }
        });
    }
}
