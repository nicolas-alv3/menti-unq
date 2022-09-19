package com.unq.mentiunq.presentation;

import com.unq.mentiunq.presentation.model.Presentation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PresentationRepository extends JpaRepository<Presentation,Long> {


}