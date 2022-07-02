package org.heikegani.training.sensei;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import org.heikegani.training.group.values.Name;
import org.heikegani.training.sensei.commands.CreateSensei;
import org.heikegani.training.sensei.events.SenseiCreated;
import org.heikegani.training.sensei.values.EquipmentId;
import org.heikegani.training.sensei.values.ProfileId;
import org.heikegani.training.sensei.values.SenseiId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Objects;

@ExtendWith(MockitoExtension.class)
class CreateSenseiUseCaseTest {
    @InjectMocks
    CreateSenseiUseCase useCase;

    @Test
    public void create_sensei_successful(){
        //arrange

        SenseiId id = SenseiId.of("123456789");
        Name name = new Name("Nombre");
        ProfileId profileId = ProfileId.of("pp");
        EquipmentId equipmentId = EquipmentId.of("ee");
        var command = new CreateSensei(id, name,  profileId, equipmentId);

        //act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase,new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();
        var senseiCreated = (SenseiCreated) events.get(0);

        //assert
        Assertions.assertTrue(Objects.nonNull(senseiCreated));
        Assertions.assertEquals("Nombre", senseiCreated.getName().value());

    }
}