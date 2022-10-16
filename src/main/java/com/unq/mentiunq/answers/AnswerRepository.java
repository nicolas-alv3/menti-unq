package com.unq.mentiunq.answers;

import com.unq.mentiunq.answers.model.Answer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AnswerRepository extends CrudRepository<Answer, Long> {
    List<Answer> findAnswerByQuestionId(String id);
}
