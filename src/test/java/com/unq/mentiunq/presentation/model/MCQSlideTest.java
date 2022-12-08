package com.unq.mentiunq.presentation.model;

import com.unq.mentiunq.answers.model.Answer;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class MCQSlideTest {
    @Test
    public void mcqSlideHasOptions() {
        MCQSlide slide = new MCQSlide();
        List<String> options = List.of("opcion 1", "opcion 2");
        slide.setOptions(options);
        assertThat(slide.getOptions()).isEqualTo(options);
    }

    @Test
    public void mcqSlideHasAnswers() {
        MCQSlide slide = new MCQSlide();
        List<String> options = List.of("opcion 1", "opcion 2");
        slide.setOptions(options);
        assertThat(slide.getAnswers()).isEmpty();
    }


    @Test
    public void mcqSlideCanReceiveAnAnswer() {
        MCQSlide slide = new MCQSlide();
        List<String> options = List.of("opcion 1", "opcion 2");
        slide.setOptions(options);
        slide.receiveAnswer("opcion 1");
        assertThat(slide.getAnswers()).isNotEmpty();
        assertThat(slide.getAnswers()).hasSize(1);
    }
    @Test
    public void mcqSlideReturnsAnswersGroupedByOptionsAnsShowingEachCorrespondingCount() {
        MCQSlide slide = new MCQSlide();
        List<String> options = List.of("opcion 1", "opcion 2");
        slide.setOptions(options);
        slide.receiveAnswer("opcion 1");
        assertThat(slide.getAnswers()).isNotEmpty();
        assertThat(slide.getAnswers().get("opcion 1")).isEqualTo(1);
        assertThat(slide.getAnswers().get("opcion 2")).isEqualTo(0);
    }
}