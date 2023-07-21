package com.ruwandi.quiz.app.service;

import com.ruwandi.quiz.app.Question;
import com.ruwandi.quiz.app.dao.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ruwandigeekiyanage on 2023-07-21.
 */
@Service
public class QuestionService {

    @Autowired
    QuestionDao questionDao;
    public List<Question> getALLQuestions() {
        return questionDao.findAll();
    }
}
