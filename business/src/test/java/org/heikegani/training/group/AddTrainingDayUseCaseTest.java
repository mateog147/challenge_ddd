package org.heikegani.training.group;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import org.heikegani.training.group.commands.AddTrainingDay;
import org.heikegani.training.group.events.GroupCreated;
import org.heikegani.training.group.events.StartHourAssigned;
import org.heikegani.training.group.events.TrainingDayAdded;
import org.heikegani.training.group.values.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class AddTrainingDayUseCaseTest {

    @InjectMocks
    AddTrainingDayUseCase useCase;

    @Mock
    DomainEventRepository repository;

    @Test
    public void day_added_successful(){
        //arrange
        GroupId groupId = GroupId.of("1");
        var command = new AddTrainingDay(groupId, new Day("LUNES"));
        when(repository.getEventsBy("1")).thenReturn(history());
        useCase.addRepository(repository);

        //act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase,new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();
        var newDay = (TrainingDayAdded) events.get(0);

        //assert
        Assertions.assertNotNull(newDay);

    }

    private List<DomainEvent> history() {
        LocationId locationId = LocationId.of("xxx");
        City city = new City("Ciudad");
        Place place = new Place("Lugar");
        ScheduleId scheduleId = new ScheduleId("xx");
        return List.of(new GroupCreated(new Location(locationId,city,place),scheduleId));
    }

}