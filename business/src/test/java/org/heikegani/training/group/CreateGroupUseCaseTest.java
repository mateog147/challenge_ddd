package org.heikegani.training.group;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import org.heikegani.training.group.commands.CreateGroup;
import org.heikegani.training.group.events.GroupCreated;
import org.heikegani.training.group.values.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class CreateGroupUseCaseTest {

    @InjectMocks
    CreateGroupUseCase useCase;

    @Test
    public  void create_group_successful(){
        //arrange

        GroupId groupId = GroupId.of("10");

        LocationId id = LocationId.of("1");
        City city = new City("Ciudad");
        Place place = new Place("Lugar");
        Location location = new Location(id, city, place);
        ScheduleId scheduleId = new ScheduleId("xx");

        var command = new CreateGroup(groupId, location, scheduleId);
        //act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase,new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();
        var groupCreated = (GroupCreated) events.get(0);
        //assert
        Assertions.assertTrue(Objects.nonNull(groupCreated));
        Assertions.assertEquals("Ciudad", groupCreated.getLocation().city().value());
        Assertions.assertEquals("LUGAR", groupCreated.getLocation().place().value());
    }

}