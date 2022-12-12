package com.unq.mentiunq.presentation.model;

import lombok.Data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Map;

@Entity
@Data
@DiscriminatorValue("WORD_CLOUD")
public class WordCloudSlide extends Slide {
    @Override
    public Map<String, Integer> getAnswers() {
        return null;
    }
}
