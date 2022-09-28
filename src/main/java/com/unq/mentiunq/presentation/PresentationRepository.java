package com.unq.mentiunq.presentation;

import com.unq.mentiunq.presentation.model.Presentation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface PresentationRepository extends CrudRepository<Presentation,Long> {


    Presentation[] findByOwnerEmail(String email);
}