package com.unq.mentiunq.answers;

import com.unq.mentiunq.answers.model.Answer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Map;

public interface AnswerRepository extends CrudRepository<Answer, Long> {
    @Query(value = "select av.values AS option, count(av.values) AS count\n" +
            "from answer\n" +
            "         join answer_values av on answer.id = av.answer_id\n" +
            "         join slide on slide.id = answer.slide_id\n" +
            "where slide.id = ?1\n" +
            "group by av.values\n" +
            "\n", nativeQuery = true)
    List<OptionCount> findAnswerBySlideId(Long id);
}
