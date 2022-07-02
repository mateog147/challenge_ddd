package org.heikegani.training.sensei.commands;

import co.com.sofka.domain.generic.Command;
import org.heikegani.training.sensei.values.SenseiId;
import org.heikegani.training.sensei.values.Tool;

public class AssignTool extends Command {
    private final SenseiId senseiId;
    private final Tool tool;

    public AssignTool(SenseiId senseiId, Tool tool) {
        this.senseiId = senseiId;
        this.tool = tool;
    }

    public SenseiId getSenseiId() {
        return senseiId;
    }

    public Tool getTool() {
        return tool;
    }
}
