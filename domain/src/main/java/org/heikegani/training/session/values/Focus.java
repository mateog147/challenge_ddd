package org.heikegani.training.session.values;

import co.com.sofka.domain.generic.ValueObject;
import org.heikegani.training.group.values.Day;

public class Focus implements ValueObject<String> {
    private enum focuses{NEWAZA, NAGUEWAZA, FISICO, KATA};

    private focuses focus;

    public Focus(String focus) {

        try {
            if(focus.isBlank()){
                throw new IllegalArgumentException("Focus provided is not valid");
            }
            String _focus= focus.toUpperCase();

            if(!isValid(focus)){
                throw new IllegalArgumentException("Focus provided is not valid");
            }
            this.focus = focuses.valueOf(_focus);

        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage());
        }

    }

    private boolean isValid(String focus) {
        for(focuses element: focuses.values()){
            if (element.name().equals(focus)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String value() {
        return this.focus.name();
    }
}
