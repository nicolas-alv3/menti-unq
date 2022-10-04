package com.unq.mentiunq.presentation;

import com.unq.mentiunq.presentation.model.Presentation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PresentationDAO {
    @Autowired
    PresentationRepository presentationRepository;
    public Presentation create(Presentation p) {
        return presentationRepository.save(p);
    }


    public List<Presentation> getAll(String email) {
        return presentationRepository.findByOwnerEmail(email);
    }

    public Presentation update(Presentation presentation) {
        return presentationRepository.save(presentation);
    }

    public void delete(Long id) {
        if( presentationRepository.existsById(id)) {
            presentationRepository.deleteById(id);
        } else {
            throw new RuntimeException("Presentation not found");
        }
    }
}