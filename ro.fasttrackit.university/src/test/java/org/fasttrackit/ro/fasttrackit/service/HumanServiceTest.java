package org.fasttrackit.ro.fasttrackit.service;

import org.fasttrackit.ro.fasttrackit.university.repository.HumanRepository;
import org.fasttrackit.ro.fasttrackit.university.service.HumanService;
import org.fasttrackit.ro.fasttrackit.university.service.model.HumanDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class HumanServiceTest {
    @InjectMocks
    HumanService service;
    @Mock
    HumanRepository repository;

    @Test
    public void firstTest(){
        List<HumanDto> expectedHumans = service.getAllHumans();

        Assertions.assertTrue(expectedHumans.isEmpty());
    }
}
