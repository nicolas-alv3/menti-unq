package com.unq.mentiunq.presentation;

import com.unq.mentiunq.presentation.model.Presentation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PresentationService {
    @Autowired
    private PresentationDAO presentationDAO;

    public Presentation create(Presentation p) {
        return presentationDAO.create(p);
    }
}