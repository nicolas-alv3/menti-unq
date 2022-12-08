package com.unq.mentiunq.presentation.model;


import com.unq.mentiunq.answers.model.Answer;
import io.swagger.models.auth.In;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.aspectj.apache.bcel.classfile.InnerClass;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class MCQSlide extends Slide {

    @ElementCollection
    private List<String> options;

    @OneToMany
    private Map<String, Integer> answers = new HashMap<>();

    public void receiveAnswer(String value) {
        answers.put(value, answers.getOrDefault(value, 0) + 1);
    }

    public Map<String, Integer> getAnswers() {
        Map<String, Integer> newMap = new HashMap<>();
        options.forEach(o -> {
            newMap.put(o, answers.getOrDefault(o, 0));
        });
        return newMap;
    }
}


