package org.heikegani.training.group;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import org.heikegani.training.group.commands.AssignStartHour;
import org.heikegani.training.group.events.GroupCreated;
import org.heikegani.training.group.events.StartHourAssigned;
import org.heikegani.training.group.values.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class AssignStartHourUseCaseTest {

    @InjectMocks
    AssignStartHourUseCase useCase;

    @Mock
    DomainEventRepository repository;

    @Test
    public void starthour_assigned_successful(){
        //arrange
        GroupId groupId = GroupId.of("1");
        int hour = 19;
        int minutes = 30;
        var command = new AssignStartHour(groupId,new StartHour(hour,minutes));
        when(repository.getEventsBy("1")).thenReturn(history());
        useCase.addRepository(repository);

        //act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase,new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();
        var startHour = (StartHourAssigned) events.get(0);

        //assert
        Assertions.assertNotNull(startHour);
        Assertions.assertEquals("19:30", startHour.getStartHour().value());
    }

    private List<DomainEvent> history() {
        LocationId locationId = LocationId.of("xxx");
        City city = new City("Ciudad");
        Place place = new Place("Lugar");
        ScheduleId scheduleId = new ScheduleId("xx");
        return List.of(new GroupCreated(new Location(locationId,city,place),scheduleId));
    }

}