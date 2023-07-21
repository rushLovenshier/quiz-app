package com.ruwandi.quiz.app.dao;

import com.ruwandi.quiz.app.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author ruwandigeekiyanage on 2023-07-21.
 */
@Repository
public interface QuestionDao extends JpaRepository<Question, Integer> {

}
