package org.heikegani.training.sensei;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;

import org.heikegani.training.group.values.Name;
import org.heikegani.training.sensei.commands.AddCourse;
import org.heikegani.training.sensei.events.CourseAdded;
import org.heikegani.training.sensei.events.SenseiCreated;
import org.heikegani.training.sensei.values.Course;
import org.heikegani.training.sensei.values.EquipmentId;
import org.heikegani.training.sensei.values.ProfileId;
import org.heikegani.training.sensei.values.SenseiId;

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
class AddCourseUseCaseTest {
    @InjectMocks
    AddCourseUseCase useCase;

    @Mock
    DomainEventRepository repository;

    @Test
    public void course_added_successful(){
        //arrange

        SenseiId senseiId = SenseiId.of("xx");
        Course newCourse = new Course("Test");
        var command = new AddCourse(senseiId, newCourse);

        when(repository.getEventsBy("xx")).thenReturn(history());
        useCase.addRepository(repository);
        //act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase,new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();
        var courseAdded = (CourseAdded) events.get(0);
        //assert
        Assertions.assertNotNull(courseAdded);
    }

    private java.util.List<DomainEvent> history() {

        Name name = new Name("Test");
        ProfileId profileId = ProfileId.of("pp");
        EquipmentId equipmentId = EquipmentId.of("ee");

        return List.of(new SenseiCreated(name, profileId, equipmentId));
    }
}