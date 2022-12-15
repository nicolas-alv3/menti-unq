package com.unq.mentiunq.presentation.model;

import lombok.Data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import java.util.HashMap;
import java.util.Map;

@Entity
@Data
@DiscriminatorValue("WORD_CLOUD")
public class WordCloudSlide extends Slide {
    @Override
    public Map<String, Integer> getAnswers() {
        return answers;
    }

    @ElementCollection
    private Map<String, Integer> answers = new HashMap<>();

    @Override
    public void receiveAnswer(String value) {
        answers.put(value, answers.getOrDefault(value, 0) + 1);
    }
}
