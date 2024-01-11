package com.mysite.sbb3.entity;

import java.time.LocalDateTime;
import java.util.List;

import com.mysite.sbb3.entity.Answer;
import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class Question {
    @Id //id로 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto-increment
    private Integer id;

    @Column(length = 200) //열의 길이
    private String subject;

    @Column(columnDefinition = "TEXT") //형식을 text
    private String content;

    private LocalDateTime createDate;
    @OneToMany(mappedBy = "question",cascade = CascadeType.REMOVE)  //1:n(질문 삭제시, 답변 다 삭제)
    private List<Answer> answerList;
}