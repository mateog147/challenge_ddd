package org.heikegani.training.group.values;

import co.com.sofka.domain.generic.Identity;

public class JudokaId extends Identity {
    public JudokaId() {
    }

    private JudokaId(String id) {
        super(id);
    }

    public static JudokaId of(String id){
        return  new JudokaId(id);
    }
}
