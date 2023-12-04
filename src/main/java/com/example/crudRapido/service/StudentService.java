package com.example.crudRapido.service;


import java.util.Optional;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.crudRapido.repository.StudentRepository;
import com.example.crudRapido.entity.Student;
@Service

public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Optional<Student> getStudentById(Long studentId) {
        return studentRepository.findById(studentId);
    }


    public void saveOrUpdateStudent(Student student) {
        studentRepository.save(student);
    }

    public void deleteStudentById(Long studentId) {
        studentRepository.deleteById(studentId);
    }
}
