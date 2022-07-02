package org.heikegani.training.group;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.heikegani.training.group.commands.AddTrainingDay;

public class AddTrainingDayUseCase extends UseCase<RequestCommand<AddTrainingDay>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AddTrainingDay> addTrainingDayRequestCommand) {
        var command = addTrainingDayRequestCommand.getCommand();
        var group = Group.from(
                command.getGroupId(),
                repository().getEventsBy(command.getGroupId().value())
        );

        group.addTrainingDay(command.getDay());

        emit().onResponse(new ResponseEvents(group.getUncommittedChanges()));

    }
}
