package com.unq.mentiunq.answers;

import com.unq.mentiunq.answers.model.Answer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Set;

@Service
public class AnswerService {

    @Autowired
    AnswerDAO answerDAO;
    @Autowired
    private SlideDAO slideDAO;

    public Answer create(Answer answer) {
        return answerDAO.create(answer);
    }

    public Set<Map.Entry<String, Integer>> getAnswerFromSlideId(Long slideId) {
        return slideDAO.getById(slideId).getAnswers().entrySet();
    }
}
