package org.fasttrackit.ro.fasttrackit.university.controller;

import org.fasttrackit.ro.fasttrackit.university.service.ProfessorService;
import org.fasttrackit.ro.fasttrackit.university.service.model.ProfessorDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProfessorController {
    private final ProfessorService professorService;

    public ProfessorController(ProfessorService professorService) {
        this.professorService = professorService;
    }

    @GetMapping("/api/professors")
    public ResponseEntity<List<ProfessorDto>> getAllProfessors() {
        return ResponseEntity.ok(professorService.getAllProfessors());
    }

    @GetMapping("/api/professors/{id}")
    public ResponseEntity<ProfessorDto> getProfessorById(@PathVariable("id") Long professorId){
        return ResponseEntity.ok(professorService.getProfessorById(professorId));
    }

    @PostMapping("/api/professors")
    public ResponseEntity createOrUpdateProfessor(@RequestBody ProfessorDto professorRequest) {
        this.professorService.createOrUpdateProfessor(professorRequest);
        return ResponseEntity.ok().build();
    }


    @DeleteMapping("/api/professors/{id}")
    public void deleteProfessorById(@PathVariable("id") Long professorId){
        this.professorService.deleteProfessorById(professorId);

    }
}
