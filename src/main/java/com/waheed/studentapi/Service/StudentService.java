package com.waheed.studentapi.Service;
import com.waheed.studentapi.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    List<Student> getAllStudents();
    Optional<Student> getStudentById(Long id);
    Student createStudent(Student student);
    Student updateStudent(Long id, Student updatedStudent);
    void deleteStudent(Long id);
}

