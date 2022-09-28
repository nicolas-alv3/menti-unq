package com.unq.mentiunq.presentation.model;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class PresentationTest {
    @Test
    public void aPresentationIsCreatedWithNoSlides() {
        String name = "aName";
        String ownerEmail = "anEmail";
        Presentation presentation = new Presentation(name, ownerEmail);
        assertThat(presentation.getSlides()).isEmpty();
    }
}