package org.heikegani.training.session.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.heikegani.training.session.values.Comment;

public class CommentAdded extends DomainEvent {
    private final Comment comment;

    public CommentAdded(Comment newComment) {
        super("heikegani.session.commentadded");
        this.comment = newComment;
    }

    public Comment getComment() {
        return comment;
    }
}
