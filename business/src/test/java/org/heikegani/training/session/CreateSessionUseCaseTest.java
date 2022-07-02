package org.heikegani.training.session;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import org.heikegani.training.group.values.GroupId;
import org.heikegani.training.session.commands.CreateSession;
import org.heikegani.training.session.events.SessionCreated;
import org.heikegani.training.session.values.Intensity;
import org.heikegani.training.session.values.ListId;
import org.heikegani.training.session.values.SchemaId;
import org.heikegani.training.session.values.SessionId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Incubating;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class CreateSessionUseCaseTest {

    @InjectMocks
    CreateSessionUseCase useCase;

    @Test
    public void session_created_successful(){
        //arrange


        GroupId groupId = GroupId.of("xx");
        SessionId sessionId = SessionId.of("yy");
        SchemaId schemaId = SchemaId.of("ss");
        Intensity intensity = new Intensity(5);
        ListId listId = ListId.of("ll");
        var command = new CreateSession(sessionId, groupId, schemaId, intensity, listId);

        //act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase,new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();
        var sessionCreated = (SessionCreated) events.get(0);

        //assert
        Assertions.assertTrue(Objects.nonNull(sessionCreated));
        Assertions.assertEquals("xx", sessionCreated.getGroupId().value());
    }

}