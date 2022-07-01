package org.heikegani.training.group.commands;

import co.com.sofka.domain.generic.Command;
import org.heikegani.training.group.values.Day;

public class AddTrainingDay extends Command {

    private final Day day;

    public AddTrainingDay(Day newDay) {
        this.day = newDay;
    }

    public Day getDay() {
        return day;
    }
}
