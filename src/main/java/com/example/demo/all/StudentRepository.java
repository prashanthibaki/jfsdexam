package com.example.demo.all;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.all.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
