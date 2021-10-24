package org.fasttrackit.ro.fasttrackit.university.controller;

import org.fasttrackit.ro.fasttrackit.university.service.StudentService;
import org.fasttrackit.ro.fasttrackit.university.service.model.StudentDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/api/students")
    public ResponseEntity<List<StudentDto>> getAllStudents() {
        return ResponseEntity.ok(studentService.getAllStudents());
    }

    @GetMapping("/api/students/{id}")
    public ResponseEntity<StudentDto> getStudentById(@PathVariable("id") Long studentId){
        return ResponseEntity.ok(studentService.getStudentById(studentId));
    }

    @PostMapping("/api/students")
    public ResponseEntity createOrUpdateStudent(@RequestBody StudentDto studentRequest) {
        this.studentService.createOrUpdateStudent(studentRequest);
        return ResponseEntity.ok().build();
    }


    @DeleteMapping("/api/students/{id}")
    public void deleteStudentById(@PathVariable("id") Long studentId){
        this.studentService.deleteStudentById(studentId);

    }
}
