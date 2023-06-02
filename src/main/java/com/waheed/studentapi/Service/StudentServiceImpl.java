package com.waheed.studentapi.Service;

import com.waheed.studentapi.Repository.StudentRepository;
import com.waheed.studentapi.Service.StudentService;
import com.waheed.studentapi.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {


    private final StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<Student> getStudentById(Long id) {
        return studentRepository.findById(id);
    }

    @Override
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student updateStudent(Long id, Student updatedStudent) {
        Student student = studentRepository.findById(id).get();
        student.setName(updatedStudent.getName());
        student.setStage(updatedStudent.getStage());
        student.setGrade(updatedStudent.getGrade());
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}