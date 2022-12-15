package com.unq.mentiunq.answers;

import com.unq.mentiunq.answers.model.AnswerPayload;
import com.unq.mentiunq.presentation.model.Slide;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
@RestController
@CrossOrigin("*")
@RequestMapping("/public/answer")
public class AnswerPublicController {

    @Autowired
    private AnswerService answerService;

    @PostMapping(value = "/")
    @ResponseBody
    @ApiOperation(value = "Registra una respuesta a una slide")
    public Slide registerAnswer(@RequestBody @Valid AnswerPayload answerPayload) {
        return answerService.slideReceiveAnswer(answerPayload.getSlideId(),answerPayload.getValue());
    }

}
