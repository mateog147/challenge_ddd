package org.heikegani.training.sensei;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.heikegani.training.sensei.commands.AddCourse;
import org.heikegani.training.sensei.commands.CreateSensei;

public class AddCourseUseCase extends UseCase<RequestCommand<AddCourse>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AddCourse> addCourseRequestCommand) {
        var command = addCourseRequestCommand.getCommand();
        var sensei = Sensei.from(command.getSenseiId(), repository().getEventsBy(command.getSenseiId().value()));

        sensei.addCourse(command.getNewCourse());

        emit().onResponse(new ResponseEvents(sensei.getUncommittedChanges()));
    }
}
