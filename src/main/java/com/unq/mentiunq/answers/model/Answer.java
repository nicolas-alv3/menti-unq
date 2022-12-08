package com.unq.mentiunq.answers.model;

import com.unq.mentiunq.presentation.model.MCQSlide;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Data
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ElementCollection
    @NotEmpty
    private List<String> values;

    @NotNull
    @ManyToOne
    private MCQSlide slide;
}
