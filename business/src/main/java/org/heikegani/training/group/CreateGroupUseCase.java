package org.heikegani.training.group;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.heikegani.training.group.commands.CreateGroup;

public class CreateGroupUseCase extends UseCase<RequestCommand<CreateGroup>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CreateGroup> createGroupRequestCommand) {
            var command = createGroupRequestCommand.getCommand();
            var group = new Group(command.getGroupId(), command.getLocation(), command.getScheduleId());

            emit().onResponse(new ResponseEvents(group.getUncommittedChanges()));
    }
}
