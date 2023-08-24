package com.ifenna.student_service.controller;

import com.ifenna.student_service.model.Library;
import com.ifenna.student_service.model.Student;
import com.ifenna.student_service.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @Autowired
    private RestTemplate restTemplate;



    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable int id){
        Library library = restTemplate.getForObject("", Library.class);

        return studentService.getStudentById(id);
    }





    @PostMapping("/insert")
    public Student insertStudent(@RequestBody Student student){
        return studentService.insert(student);
    }
}
