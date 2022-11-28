package com.unq.mentiunq.answers;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin("*")
@RequestMapping("/api/answer")
public class AnswerController {
    @Autowired
    private AnswerService answerService;

    @GetMapping(value = "/{slideId}")
    @ResponseBody
    @ApiOperation(value = "Obtiene las respuestas a una slide")
    public List<OptionCount> getAnswersBySlideId(@PathVariable Long slideId) {
        return answerService.getAnswerFromSlideId(slideId);
    }
}