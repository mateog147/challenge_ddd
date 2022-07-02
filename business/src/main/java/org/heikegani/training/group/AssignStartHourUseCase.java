package org.heikegani.training.group;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.heikegani.training.group.commands.AssignStartHour;
import org.heikegani.training.group.values.StartHour;

public class AssignStartHourUseCase extends UseCase<RequestCommand<AssignStartHour>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AssignStartHour> assignStartHourRequestCommand) {
            var command = assignStartHourRequestCommand.getCommand();

        var group = Group.from(
                command.getGroupId(),
                repository().getEventsBy(command.getGroupId().value())
        );

        group.assignStartHour(command.getStartHour());

        emit().onResponse(new ResponseEvents(group.getUncommittedChanges()));
    }
}
