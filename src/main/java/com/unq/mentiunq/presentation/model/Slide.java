package com.unq.mentiunq.presentation.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Map;

@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Getter
@Setter
@Entity
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = MCQSlide.class, name = "MCQ"),
        @JsonSubTypes.Type(value = WordCloudSlide.class, name = "WORD_CLOUD")})
public abstract class Slide {
    String question;
    Integer presentationOrder;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ElementCollection
    public abstract Map<String, Integer> getAnswers();
    public abstract void receiveAnswer(String value);
}
