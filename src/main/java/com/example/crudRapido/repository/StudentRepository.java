package com.example.crudRapido.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.crudRapido.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    
}
