package org.fasttrackit.ro.fasttrackit.university.controller;

import org.fasttrackit.ro.fasttrackit.university.service.SemesterService;
import org.fasttrackit.ro.fasttrackit.university.service.model.SemesterDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SemesterController {
    private final SemesterService semesterService;

    public SemesterController(SemesterService semesterService) {
        this.semesterService = semesterService;
    }

    @GetMapping("/api/semesters")
    public ResponseEntity<List<SemesterDto>> getAllSemesters() {
        return ResponseEntity.ok(semesterService.getAllSemesters());
    }

    @GetMapping("/api/semester/{id}")
    public ResponseEntity<String> getSemesterById(@PathVariable("id") Long semesterId,
                                                   @RequestParam() String searchingFor){
        return ResponseEntity.ok(semesterService.getSemesterById(semesterId) + searchingFor);
    }

    @PostMapping("/api/semester")
    public ResponseEntity createOrUpdateSemester(@RequestBody SemesterDto semesterRequest) {
        this.semesterService.createOrUpdateSemester(semesterRequest);
        return ResponseEntity.ok().build();
    }


    @DeleteMapping("/api/semester/{id}")
    public void deleteSemesterById(@PathVariable("id") Long semesterId){
        this.semesterService.deleteSemesterById(semesterId);

    }
}
