package com.mysite.sbb3.repository;

import com.mysite.sbb3.domain.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
//db조회 가능함 = repository
public interface AnswerRepository extends JpaRepository<Answer,Integer> {
}
