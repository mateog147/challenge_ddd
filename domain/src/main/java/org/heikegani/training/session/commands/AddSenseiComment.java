package org.heikegani.training.session.commands;

import co.com.sofka.domain.generic.Command;
import org.heikegani.training.session.values.Comment;

public class AddSenseiComment extends Command{
    private final Comment newComment;

    public AddSenseiComment(Comment newComment) {
        this.newComment = newComment;
    }

    public Comment getNewComment() {
        return newComment;
    }
}
