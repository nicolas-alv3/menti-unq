package com.unq.mentiunq.answers.model;

import lombok.Data;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Data
public class Answer {
    @Id
    private Long id;

    @ElementCollection
    @NotEmpty
    private List<String> values;

    @NotNull
    private String questionId;
}
