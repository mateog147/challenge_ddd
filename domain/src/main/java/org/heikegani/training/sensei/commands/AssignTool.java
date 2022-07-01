package org.heikegani.training.sensei.commands;

import co.com.sofka.domain.generic.Command;
import org.heikegani.training.sensei.values.Tool;

public class AssignTool extends Command {

    private final Tool tool;

    public AssignTool(Tool tool) {
        this.tool = tool;
    }

    public Tool getTool() {
        return tool;
    }
}
