package com.exam.architecturefinal.forupdate.services;

import com.exam.architecturefinal.forupdate.daos.ExamsRepository;
import com.exam.architecturefinal.forupdate.models.Exam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UpdateExamService {

    @Autowired
    ExamsRepository examsRepository;

    public List<Exam> getAllExams() {
        ArrayList<Exam> exams = new ArrayList<>();
        Exam exam = new Exam();
        exam.setExamId(1);
        exam.setExamName("BAC");
        exams.add(exam);
        return (List<Exam>) examsRepository.findAll();
    }

    public Exam getExamById(int examId) {
        return examsRepository.findExamByExamId(examId);
    }

    public String updateExam(Exam exam) {
        examsRepository.save(exam);
        return "Exam: " + exam.getExamId() + "Updated.";
    }

    public String addNewExam(Exam exam) {
        examsRepository.save(exam);
        return "Exam: " + exam.getExamId() + "Added.";
    }

}
