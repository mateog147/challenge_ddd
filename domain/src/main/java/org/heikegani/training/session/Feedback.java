package org.heikegani.training.session;

import co.com.sofka.domain.generic.Entity;
import org.heikegani.training.session.values.Comment;
import org.heikegani.training.session.values.FeedbackId;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Feedback extends Entity<FeedbackId> {
    private Set<Comment> comments;

    public Feedback(FeedbackId entityId) {
        super(entityId);
        this.comments = new HashSet<>();
    }

    public void addComment(Comment newcomment){
        Objects.requireNonNull(newcomment);
        this.comments.add(newcomment);
    }
}
