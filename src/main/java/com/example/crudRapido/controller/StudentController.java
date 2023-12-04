package com.example.crudRapido.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crudRapido.entity.Student;
import com.example.crudRapido.service.StudentService;

@RestController
@RequestMapping(path = "/api/v1/students")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PostMapping
    public void saveUpdate(@RequestBody Student student) {
        studentService.saveOrUpdateStudent(student);
    }

    @DeleteMapping("/{studentId}")
    public void deleteStudentById(@PathVariable("studentId") Long studentId) {
        studentService.deleteStudentById(studentId);
    }
}
