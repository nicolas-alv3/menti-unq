package com.unq.mentiunq.answers.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AnswerPayload {
    private String value;
    private Long slideId;
}
