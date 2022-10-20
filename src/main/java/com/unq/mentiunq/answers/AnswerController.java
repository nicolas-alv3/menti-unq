package com.unq.mentiunq.answers;

import com.unq.mentiunq.answers.model.Answer;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@CrossOrigin("*")
@RequestMapping("/api/answer")
public class AnswerController {
    @Autowired
    private AnswerService answerService;

    @PostMapping(value = "/")
    @ResponseBody
    @ApiOperation(value = "Registra una respuesta a una slide")
    public Answer registerAnswer(@RequestBody @Valid Answer answer) {
        return answerService.create(answer);
    }

    @GetMapping(value = "/{slideId}")
    @ResponseBody
    @ApiOperation(value = "Obtiene las respuestas a una slide")
    public List<OptionCount> getAnswersBySlideId(@PathVariable Long slideId) {
        return answerService.getAnswerFromSlideId(slideId);
    }
}