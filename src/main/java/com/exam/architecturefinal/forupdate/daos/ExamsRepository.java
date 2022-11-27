package com.exam.architecturefinal.forupdate.daos;

import com.exam.architecturefinal.forupdate.models.Exam;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface ExamsRepository extends CrudRepository<Exam, Integer> {
    Exam findExamByExamId(int examId);
}
