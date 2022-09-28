package com.unq.mentiunq.presentation;

import com.unq.mentiunq.presentation.model.Presentation;
import lombok.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PresentationRepository extends CrudRepository<Presentation, Long> {

    List<Presentation> findByOwnerEmail(String email);

    @NonNull List<Presentation> findAll();
}