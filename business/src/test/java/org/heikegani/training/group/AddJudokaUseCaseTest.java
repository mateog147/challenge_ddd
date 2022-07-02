package org.heikegani.training.group;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import org.heikegani.training.group.commands.AddJudoka;
import org.heikegani.training.group.events.GroupCreated;
import org.heikegani.training.group.events.JudokaAdded;
import org.heikegani.training.group.values.*;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class AddJudokaUseCaseTest {

    @InjectMocks
    AddJudokaUseCase useCase;

    @Mock
    DomainEventRepository repository;

    @Test
    public void judoka_added_successful(){
        //arrange
        GroupId groupId = GroupId.of("1");
        JudokaId judokaId = JudokaId.of("123");
        Name name = new Name("test");

        var command = new AddJudoka(groupId, judokaId, name);
        when(repository.getEventsBy("1")).thenReturn(history());
        useCase.addRepository(repository);
        //act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase,new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();
        var judoka = (JudokaAdded) events.get(0);
        //assert
        Assertions.assertNotNull(judoka);
        Assertions.assertEquals("test", judoka.getName().value());
    }

    private List<DomainEvent> history() {
        LocationId locationId = LocationId.of("xxx");
        City city = new City("Ciudad");
        Place place = new Place("Lugar");
        ScheduleId scheduleId = new ScheduleId("xx");
        return List.of(new GroupCreated(new Location(locationId,city,place),scheduleId));
    }

}