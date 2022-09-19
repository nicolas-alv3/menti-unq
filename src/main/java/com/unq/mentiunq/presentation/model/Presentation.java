package com.unq.mentiunq.presentation.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Presentation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<Slide> slides;

    public Presentation() {
    }

}
