package org.heikegani.training.group.values;

import co.com.sofka.domain.generic.ValueObject;

public class StartHour implements ValueObject<String> {
    private final String starHour;

    public StartHour(int hour, int minutes) {
        try {
            if(hour >=24 || hour < 0){
                throw new IllegalArgumentException("Hour value must be between 0 and 23");
            }

            if(minutes > 59 || minutes < 0){
                throw new IllegalArgumentException("Minute value must be between 0 and 59");
            }

        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        this.starHour = Integer.toString(hour)+":"+Integer.toString(minutes);
    }

    @Override
    public String value() {
        return this.starHour;
    }
}
