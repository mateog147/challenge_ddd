package org.heikegani.training.session.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.heikegani.training.group.values.GroupId;
import org.heikegani.training.session.values.Intensity;
import org.heikegani.training.session.values.ListId;
import org.heikegani.training.session.values.SchemaId;

public class SessionCreated extends DomainEvent {
    private final GroupId groupId;
    private final SchemaId schemaId;
    private final Intensity intensity;
    private final ListId listId;
    public SessionCreated(GroupId groupId, SchemaId schemaId, Intensity intensity, ListId listId) {
        super("heikegani.session.sessioncreated");
        this.groupId = groupId;
        this.schemaId = schemaId;
        this.intensity = intensity;
        this.listId = listId;
    }

    public SchemaId getSchemaId() {
        return schemaId;
    }

    public Intensity getIntensity() {
        return intensity;
    }

    public ListId getListId() {
        return listId;
    }

    public GroupId getGroupId() {
        return groupId;
    }
}
