package com.labpractice.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "Marks")
public class MarksDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="student_name")
    private String studentName;

    @Column(name="subject_num")
    private Integer subjectNum;

    @Column(name="subject_name")
    private String subjectName;

    @Column(name="mse_marks")
    private Integer mseMarks;

    @Column(name="ese_marks")
    private Integer eseMarks;
}
