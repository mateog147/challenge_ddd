package org.heikegani.training.session.commands;

import co.com.sofka.domain.generic.Command;
import org.heikegani.training.session.values.Comment;
import org.heikegani.training.session.values.SessionId;

public class AddSenseiComment extends Command{
    private final SessionId entityId;
    private final Comment newComment;

    public AddSenseiComment(SessionId entityId, Comment newComment) {
        this.entityId = entityId;
        this.newComment = newComment;
    }

    public Comment getNewComment() {
        return newComment;
    }

    public SessionId getEntityId() {
        return entityId;
    }
}
