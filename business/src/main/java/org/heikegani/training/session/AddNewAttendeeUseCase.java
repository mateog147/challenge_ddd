package org.heikegani.training.session;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.heikegani.training.session.commands.AddNewAttendee;
import org.heikegani.training.session.commands.AssignSensei;

public class AddNewAttendeeUseCase extends UseCase<RequestCommand<AddNewAttendee>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AddNewAttendee> addNewAttendeeRequestCommand) {
        var command = addNewAttendeeRequestCommand.getCommand();
        var session = Session.from(command.getEntityId(), repository().getEventsBy(command.getEntityId().value()));
        session.addNewAttendee(command.getNewAttendee());

        emit().onResponse(new ResponseEvents(session.getUncommittedChanges()));
    }
}
