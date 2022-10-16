package com.unq.mentiunq.presentation;

import com.unq.mentiunq.presentation.model.Presentation;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/public/presentation")
public class PresentationPublicController {
    @Autowired
    private PresentationService presentationService;

    @GetMapping(value = "/{id}")
    @ResponseBody
    @ApiOperation(value = "Obtiene la presentacion con el id dado")
    public Presentation getPresentationById(@PathVariable Long id) {
        return presentationService.getById(id);
    }
}
