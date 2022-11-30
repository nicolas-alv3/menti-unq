package com.unq.mentiunq.answers;

import com.unq.mentiunq.answers.model.Answer;
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
    public Answer registerAnswer(@RequestBody @Valid Answer answer) {
        return answerService.create(answer);
    }

}
