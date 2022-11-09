package com.unq.mentiunq.presentation.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
@Entity
@Getter
@Setter
public class Slide {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    String question;

    @ElementCollection
    List<String> options;

    Integer presentationOrder;
}
