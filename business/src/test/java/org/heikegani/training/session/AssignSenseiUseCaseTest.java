package org.heikegani.training.session;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import org.heikegani.training.group.Location;
import org.heikegani.training.group.commands.AssignStartHour;
import org.heikegani.training.group.events.GroupCreated;
import org.heikegani.training.group.events.StartHourAssigned;
import org.heikegani.training.group.values.*;
import org.heikegani.training.sensei.values.SenseiId;
import org.heikegani.training.session.commands.AssignSensei;
import org.heikegani.training.session.events.SenseiAssigned;
import org.heikegani.training.session.events.SessionCreated;
import org.heikegani.training.session.values.Intensity;
import org.heikegani.training.session.values.ListId;
import org.heikegani.training.session.values.SchemaId;
import org.heikegani.training.session.values.SessionId;
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
class AssignSenseiUseCaseTest {
    @InjectMocks
    AssignSenseiUseCase useCase;

    @Mock
    DomainEventRepository repository;

    @Test
    public void sensei_assigned_successful(){
        //arrange

        SessionId sessionId = SessionId.of("xx");
        SenseiId senseiId = SenseiId.of("yy");
        var command = new AssignSensei(sessionId, senseiId);
        when(repository.getEventsBy("xx")).thenReturn(history());
        useCase.addRepository(repository);

        //act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase,new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();
        var senseiAssigned = (SenseiAssigned) events.get(0);

        //assert
        Assertions.assertNotNull(senseiAssigned);
        Assertions.assertEquals("yy", senseiAssigned.getSenseiId().value());

    }

    private java.util.List<DomainEvent> history() {

        GroupId groupId = GroupId.of("xx");
        SchemaId schemaId = SchemaId.of("ss");
        Intensity intensity = new Intensity(5);
        ListId listId = ListId.of("ll");
        return List.of(new SessionCreated(groupId,schemaId,intensity,listId));
    }

}