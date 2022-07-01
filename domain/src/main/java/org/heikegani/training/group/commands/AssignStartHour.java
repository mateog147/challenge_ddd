package org.heikegani.training.group.commands;

import co.com.sofka.domain.generic.Command;

public class AssignStartHour extends Command {

    private final int hour;
    private final int minutes;

    public AssignStartHour(int hour, int minutes) {
        this.hour = hour;
        this.minutes = minutes;
    }

    public int getHour() {
        return hour;
    }

    public int getMinutes() {
        return minutes;
    }
}
