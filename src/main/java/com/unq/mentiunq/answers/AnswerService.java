package com.unq.mentiunq.answers;

import com.unq.mentiunq.presentation.model.Slide;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Set;

@Service
public class AnswerService {

    @Autowired
    private SlideDAO slideDAO;

    public Set<Map.Entry<String, Integer>> getAnswerFromSlideId(Long slideId) {
        return slideDAO.getById(slideId).getAnswers().entrySet();
    }

    public Slide slideReceiveAnswer(Long slideId, String value) {
        Slide slide = slideDAO.getById(slideId);
        slide.receiveAnswer(value);

        return slideDAO.save(slide);
    }
}
