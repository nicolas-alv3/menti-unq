package com.unq.mentiunq.answers;

import com.unq.mentiunq.presentation.model.Slide;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface SlideRepository extends CrudRepository<Slide, Long> {
    @Override
    Optional<Slide> findById(Long aLong);
}
