package com.exam.architecturefinal.forupdate.controllers;

import com.exam.architecturefinal.forupdate.models.Exam;
import com.exam.architecturefinal.forupdate.services.UpdateExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class HomePageController {

    @Autowired
    UpdateExamService updateExamService;

    @GetMapping("/")
    public String sayHello() {
        return "Hey Dude!!!";
    }

    @GetMapping("/getAllExams")
    public List<Exam> getAllExams() {
        return updateExamService.getAllExams();
    }

    @GetMapping("/getExam/{examId}")
    public Exam getExamById(@PathVariable int examId) {
        return updateExamService.getExamById(examId);
    }

    @PutMapping("/updateExam")
    public String updateExam(@RequestBody Exam exam) {
        return updateExamService.updateExam(exam);
    }

    @PostMapping("/addExam")
    public String addNewExam(@RequestBody Exam exam) {
        return updateExamService.addNewExam(exam);
    }

}
