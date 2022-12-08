package com.unq.mentiunq.presentation.model;


import javax.persistence.*;
import java.util.List;
public class MCQSlide extends Slide {

    @ElementCollection
    List<String> options;

}
