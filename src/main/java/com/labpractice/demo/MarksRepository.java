package com.labpractice.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface MarksRepository extends JpaRepository<MarksDTO, Integer>{
    public List<MarksDTO> findByStudentName(String studentName);
}
