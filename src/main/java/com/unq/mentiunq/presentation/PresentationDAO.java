package com.unq.mentiunq.presentation;

import com.unq.mentiunq.presentation.model.Presentation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PresentationDAO {
    @Autowired
    PresentationRepository presentationRepository;
    public Presentation create(Presentation p) {
        return presentationRepository.save(p);
    }
}