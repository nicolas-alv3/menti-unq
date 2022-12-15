package com.unq.mentiunq.answers;

import com.unq.mentiunq.presentation.model.Slide;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SlideDAO {
    @Autowired
    private SlideRepository slideRepository;

    public Slide getById(Long slideId) {
        return slideRepository.findById(slideId).orElseThrow(() -> {
            throw new RuntimeException("No se pudo encontrar la slide con ese ID");
        });
    }

    public Slide save(Slide slide) {
        return slideRepository.save(slide);
    }
}
