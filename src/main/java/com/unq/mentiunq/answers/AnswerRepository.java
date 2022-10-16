package com.unq.mentiunq.answers;

import com.unq.mentiunq.answers.model.Answer;
import org.springframework.data.repository.CrudRepository;

public interface AnswerRepository extends CrudRepository<Answer, Long> {
}
