package com.unq.mentiunq.answers;

import com.unq.mentiunq.answers.model.Answer;
import org.springframework.stereotype.Service;

@Service
public class AnswerService {

    AnswerDAO answerDAO;

    public Answer create(Answer answer) {
        return answerDAO.create(answer);
    }
}
