package com.ifenna.student_service.repo;

import com.ifenna.student_service.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Integer> {
}
