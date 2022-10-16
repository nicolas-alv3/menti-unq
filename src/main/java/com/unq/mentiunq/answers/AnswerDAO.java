package com.unq.mentiunq.answers;

import com.unq.mentiunq.answers.model.Answer;
import org.springframework.stereotype.Component;

@Component
public class AnswerDAO {

    AnswerRepository answerRepository;

    public Answer create(Answer answer) {
        return answerRepository.save(answer);
    }
}
