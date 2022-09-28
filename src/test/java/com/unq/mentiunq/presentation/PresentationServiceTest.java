package com.unq.mentiunq.presentation;

import com.unq.mentiunq.presentation.model.Presentation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

@SpringBootTest
@RunWith(SpringRunner.class)
public class PresentationServiceTest {

    @Mock
    PresentationDAO presentationDAO;

    @InjectMocks
    private PresentationService presentationService;

    @Test
    public void returnsAnEmptyListWhenUserHasNoPresentations() {
        String emailWithNoPresentations = "foo@var.com";

        when(presentationDAO.getAll(eq(emailWithNoPresentations))).thenReturn(Collections.emptyList());
        assertThat(presentationService.getAllPresentations(emailWithNoPresentations)).isEmpty();
    }

    @Test
    public void createsANewPresentationWithRequiredAttributes() {
        String name = "aName";
        String ownerEmail = "ownerEmail";
        Presentation presentation = new Presentation(name, ownerEmail);
        //Aca falta la logica de id pero eso se encarga el ORM, no vamos a testear el ORM
        when(presentationDAO.create(presentation)).thenReturn(presentation);
        assertThat(presentationService.create(presentation)).isEqualTo(presentation);
    }
}