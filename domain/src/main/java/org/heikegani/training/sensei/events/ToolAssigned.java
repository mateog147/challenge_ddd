package org.heikegani.training.sensei.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.heikegani.training.sensei.values.Tool;

public class ToolAssigned extends DomainEvent {
    private final Tool newTool;

    public ToolAssigned(Tool tool) {
        super("heikegani.sensei.toolassigned");
        this.newTool = tool;
    }

    public Tool getNewTool() {
        return newTool;
    }
}
