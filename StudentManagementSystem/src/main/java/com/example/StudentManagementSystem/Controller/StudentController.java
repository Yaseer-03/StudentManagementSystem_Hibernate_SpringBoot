package com.example.StudentManagementSystem.Controller;

import com.example.StudentManagementSystem.Model.Student;
import com.example.StudentManagementSystem.Repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;
    @GetMapping("/")
    public String greet(){
        return "Welcome To Student Management System";
    }

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable long id){
        return studentRepository.findById(id).get();
    }

    @PostMapping("/students/add")
    public String addStudent(@RequestBody Student student) {
         studentRepository.save(student);
         return "Student Data Added Successfully";
    }

    @PutMapping("/students/update/{id}")
    public String updateStudent(@PathVariable long id, @RequestBody Student updatedStudent) {
     Student std = studentRepository.findById(id).orElseThrow( () -> new RuntimeException("No student exists with id" + id));
     std.setBranch(updatedStudent.getBranch());
     std.setName(updatedStudent.getName());
     std.setPercentage(updatedStudent.getPercentage());
     studentRepository.save(std);

        return "Student Data Updated Successfully";
    }

    @DeleteMapping("/students/delete/{id}")
    public String deleteStudent(@PathVariable long id){
        studentRepository.deleteById(id);
        return "Student Data Delete Successfully";
    }
}
