package com.unq.mentiunq.presentation;

import com.unq.mentiunq.presentation.model.Presentation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PresentationService {
    @Autowired
    private PresentationDAO presentationDAO;

    public Presentation create(Presentation p) {
        return presentationDAO.create(p);
    }

    public List<Presentation> getAllPresentations(String email) {
        return presentationDAO.getAll(email);
    }

    public Presentation update(Presentation presentation) {
        return presentationDAO.update(presentation);
    }

    public void delete(Long id) {
        presentationDAO.delete(id);
    }
}