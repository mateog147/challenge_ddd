package org.heikegani.training.sensei;

import co.com.sofka.domain.generic.Entity;
import org.heikegani.training.sensei.values.Course;
import org.heikegani.training.sensei.values.EquipmentId;
import org.heikegani.training.sensei.values.Tool;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Equipment extends Entity<EquipmentId> {
    private Set<Tool> tools;

    public Equipment(EquipmentId entityId) {
        super(entityId);
        this.tools = new HashSet<>();
    }

    public void addCourse(Tool newTool){
        this.tools.add(Objects.requireNonNull(newTool));
    }

}
