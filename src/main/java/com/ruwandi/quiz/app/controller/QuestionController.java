package com.ruwandi.quiz.app.controller;

import com.ruwandi.quiz.app.Question;
import com.ruwandi.quiz.app.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ruwandigeekiyanage on 2023-07-21.
 */
@RestController
@RequestMapping("question")
public class QuestionController {
    @Autowired
    QuestionService questionService;
    @GetMapping("allQuestions")
    public List<Question> getALlQuestions(){
        return questionService.getALLQuestions();
    }
}
