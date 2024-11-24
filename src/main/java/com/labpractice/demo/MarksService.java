package com.labpractice.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MarksService {
    @Autowired MarksRepository marksRepository;

    public List<MarksDTO> getAllMarks() {
        return marksRepository.findAll();
    }

    public List<MarksDTO> getMarksByName(String name) {
        return marksRepository.findByStudentName(name);
    }
}
