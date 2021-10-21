package org.fasttrackit.ro.fasttrackit.university.controller;

import org.fasttrackit.ro.fasttrackit.university.service.CoursesService;
import org.fasttrackit.ro.fasttrackit.university.service.model.CoursesDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CoursesController {
    private final CoursesService coursesService;

    public CoursesController(CoursesService coursesService) {

        this.coursesService = coursesService;
    }


    @GetMapping("/api/courses")
    public ResponseEntity<List<CoursesDto>> getAllCourses() {
        return ResponseEntity.ok(coursesService.getAllCourses());
    }

    @GetMapping("/api/courses/{id}")
    public ResponseEntity<CoursesDto> getCourseById(@PathVariable("id") Long courseId) {
        return ResponseEntity.ok(coursesService.getById(courseId));
    }

    @PostMapping("/api/course")
    public ResponseEntity createOrUpdateCourse(@RequestBody CoursesDto courseRequest) {
        this.coursesService.createOrUpdateCourse(courseRequest);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/api/course/{id}")
    public void deleteCourseById(@PathVariable("id") Long courseId) {

        this.coursesService.deleteCourseById(courseId);
    }
}


