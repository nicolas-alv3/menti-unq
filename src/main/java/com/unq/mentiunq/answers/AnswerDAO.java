package com.unq.mentiunq.answers;

import com.unq.mentiunq.answers.model.Answer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class AnswerDAO {

    @Autowired
    AnswerRepository answerRepository;

    public Answer create(Answer answer) {
        return answerRepository.save(answer);
    }

    public List<Map<String, Integer>> getAnswerFromSlideId(Long slideId) {
        return answerRepository.findAnswerBySlideId(slideId);
    }
}
