package com.unq.mentiunq.presentation.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Collections;
import java.util.List;

@Entity
@Getter
@Setter
public class Presentation {
    public Presentation(String name, String ownerEmail) {
        this.name = name;
        this.ownerEmail = ownerEmail;
        this.slides = Collections.emptyList();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    @NotBlank(message = "Name is mandatory")
    private String name;

    private String ownerEmail;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Slide> slides;

    public Presentation() {
    }

}
