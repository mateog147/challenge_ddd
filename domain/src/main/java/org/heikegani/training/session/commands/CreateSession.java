package org.heikegani.training.session.commands;

import co.com.sofka.domain.generic.Command;
import org.heikegani.training.group.values.GroupId;
import org.heikegani.training.session.values.Intensity;
import org.heikegani.training.session.values.ListId;
import org.heikegani.training.session.values.SchemaId;
import org.heikegani.training.session.values.SessionId;

public class CreateSession extends Command {

    private final GroupId groupId;
    private final SessionId entityId;
    private final SchemaId schemaId;
    private final Intensity intensity;
    private final ListId listId;

    public CreateSession(SessionId entityId, GroupId groupId, SchemaId schemaId, Intensity intensity, ListId listId) {
        this.groupId = groupId;
        this.entityId = entityId;
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

    public SessionId getEntityId() {
        return entityId;
    }
}
