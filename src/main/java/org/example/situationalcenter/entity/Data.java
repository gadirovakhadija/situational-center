package org.example.situationalcenter.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Entity
@Setter
@Getter
@EqualsAndHashCode
public class Data {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "question_count")
    private int questionCount;
    @Basic
    @Column(name = "general_count")
    private int generalCount;
    @Basic
    @Column(name = "invisibles_count")
    private int invisiblesCount;
    @Basic
    @Column(name = "rejected_count")
    private int rejectedCount;
    @Basic
    @Column(name = "mobile_count")
    private int mobileCount;
    @Basic
    @Column(name = "chief_feedback_count")
    private int chiefFeedbackCount;
    @Basic
    @Column(name = "feedbacks_count")
    private int feedbacksCount;
    @Basic
    @Column(name = "tobe_viewed_count")
    private int tobeViewedCount;

}
