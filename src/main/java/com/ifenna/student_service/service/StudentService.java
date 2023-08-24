package com.ifenna.student_service.service;

import com.ifenna.student_service.model.Student;
import com.ifenna.student_service.repo.StudentRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//@RequiredArgsConstructor
public class StudentService {
  @Autowired
    private StudentRepo studentRepo;

    public Student getStudentById(int id){
return studentRepo.findById(id).get();
    }
    public Student insert(Student student){
        return studentRepo.save(student);
    }
}
