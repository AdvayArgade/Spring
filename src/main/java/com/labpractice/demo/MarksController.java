package com.labpractice.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/marks")
public class MarksController {

    @Autowired MarksService marksService;

    @GetMapping("/")
    public List<MarksDTO> getAllMarks() {
        return marksService.getAllMarks();
    }

    @GetMapping("/{name}")
    public List<MarksDTO> getMarksByName(@PathVariable String name) {
        return marksService.getMarksByName(name);
    }
    
}
