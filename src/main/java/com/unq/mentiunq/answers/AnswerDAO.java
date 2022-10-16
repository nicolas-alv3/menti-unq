package com.unq.mentiunq.answers;

import com.unq.mentiunq.answers.model.Answer;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class AnswerDAO {

    @Autowired
    AnswerRepository answerRepository;

    public Answer create(Answer answer) {
        return answerRepository.save(answer);
    }

    public HashMap<String, Integer> getAnswerFromSlideId(Long slideId) {
        val answers = answerRepository.findAnswerByQuestionId(slideId.toString());
        val response = new HashMap<String, Integer>();
        answers.forEach(answer -> answer.getValues().forEach(value -> {
            response.put(value, response.getOrDefault(value,0) + 1);
        }));
        return response;
    }
}
