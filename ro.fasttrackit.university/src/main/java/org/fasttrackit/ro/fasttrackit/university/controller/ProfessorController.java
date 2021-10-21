package org.fasttrackit.ro.fasttrackit.university.controller;

import org.fasttrackit.ro.fasttrackit.university.service.ProfessorService;
import org.fasttrackit.ro.fasttrackit.university.service.model.HumanDto;
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
    public ResponseEntity<String> getProfessorById(@PathVariable("id") Long professorId,
                                               @RequestParam() String searchingFor){
        return ResponseEntity.ok(professorService.getProfessorById(professorId) + searchingFor);
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
