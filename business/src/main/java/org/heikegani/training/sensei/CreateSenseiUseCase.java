package org.heikegani.training.sensei;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.heikegani.training.sensei.commands.CreateSensei;

public class CreateSenseiUseCase extends UseCase<RequestCommand<CreateSensei>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CreateSensei> createSenseiRequestCommand) {
        var command = createSenseiRequestCommand.getCommand();
        var sensei =new Sensei(command.getEntityId(),command.getName(), command.getProfileId(), command.getEquipmentId());

        emit().onResponse(new ResponseEvents(sensei.getUncommittedChanges()));
    }
}
