package org.heikegani.training.group;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.heikegani.training.group.commands.AddJudoka;

public class AddJudokaUseCase extends UseCase<RequestCommand<AddJudoka>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AddJudoka> addJudokaRequestCommand) {
        var command = addJudokaRequestCommand.getCommand();
        var group = Group.from(
                command.getGroupId(),
                repository().getEventsBy(command.getGroupId().value())
        );

        group.addJudoka(command.getJudokaId(),command.getName());

        emit().onResponse(new ResponseEvents(group.getUncommittedChanges()));
    }
}
