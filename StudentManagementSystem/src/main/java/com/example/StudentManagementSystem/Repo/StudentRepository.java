package com.example.StudentManagementSystem.Repo;

import com.example.StudentManagementSystem.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
