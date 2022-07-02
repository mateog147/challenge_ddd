package org.heikegani.training.session;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.heikegani.training.session.commands.AssignSensei;
import org.heikegani.training.session.commands.CreateSession;

public class AssignSenseiUseCase extends UseCase<RequestCommand<AssignSensei>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AssignSensei> assignSenseiRequestCommand) {
        var command = assignSenseiRequestCommand.getCommand();
        var session = Session.from(command.getEntityId(), repository().getEventsBy(command.getEntityId().value()));
        session.assignSensei(command.getSenseiId());

        emit().onResponse(new ResponseEvents(session.getUncommittedChanges()));
    }
}
