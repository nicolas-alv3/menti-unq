package com.unq.mentiunq.presentation;

import com.unq.mentiunq.presentation.model.Presentation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;


@RestController
@Component(value = "PresentationController")
@RequestMapping("/presentation")
public class PresentationController {
    @Autowired
    private PresentationService presentationService;

    @RequestMapping(method = RequestMethod.POST, value = "/")
    public ResponseEntity<Presentation> createPresentation(@RequestBody Presentation presentation) {
        return new ResponseEntity<>(presentationService.create(presentation), HttpStatus.OK);
    }
}