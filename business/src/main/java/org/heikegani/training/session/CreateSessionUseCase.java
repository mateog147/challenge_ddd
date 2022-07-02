package org.heikegani.training.session;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.heikegani.training.session.commands.CreateSession;

public class CreateSessionUseCase extends UseCase<RequestCommand<CreateSession>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CreateSession> createSessionRequestCommand) {
        var command = createSessionRequestCommand.getCommand();
        var session = new Session(command.getEntityId(), command.getGroupId(), command.getSchemaId(),command.getIntensity(), command.getListId());

        emit().onResponse(new ResponseEvents(session.getUncommittedChanges()));
    }
}
