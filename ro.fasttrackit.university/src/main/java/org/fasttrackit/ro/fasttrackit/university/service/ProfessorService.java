package org.fasttrackit.ro.fasttrackit.university.service;

import org.fasttrackit.ro.fasttrackit.university.repository.ProfessorRepository;
import org.fasttrackit.ro.fasttrackit.university.repository.dao.ProfessorEntity;
import org.fasttrackit.ro.fasttrackit.university.service.model.ProfessorDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProfessorService {

    private final ProfessorRepository professorRepository;

    public ProfessorService(ProfessorRepository professorRepository) {
        this.professorRepository = professorRepository;
    }

    public List<ProfessorDto> getAllProfessors() {
        final List<ProfessorEntity> allProfessors = this.professorRepository.findAll();
        return allProfessors.stream()
                .map(humanEntity -> {
                    ProfessorDto createdProfessor = new ProfessorDto();
                    createdProfessor.setId(humanEntity.getId());
                    createdProfessor.setCnp(humanEntity.getCnp());
                    createdProfessor.setFirstname(humanEntity.getFirstname());
                    createdProfessor.setLastname(humanEntity.getLastname());
                    return createdProfessor;
                })
                .collect(Collectors.toList());
    }

    public List<ProfessorDto> getProfessorById(Long id) {
        final Optional<ProfessorEntity> professorById = this.professorRepository.findById(id);
        return professorById.stream()
                .map(humanEntity -> {
                    ProfessorDto sortedProfessor = new ProfessorDto();
                    sortedProfessor.setId(humanEntity.getId());
                    sortedProfessor.setCnp(humanEntity.getCnp());
                    sortedProfessor.setFirstname(humanEntity.getFirstname());
                    sortedProfessor.setLastname(humanEntity.getLastname());
                    return sortedProfessor;
                })
                .collect(Collectors.toList());

    }

    public void createOrUpdateProfessor(ProfessorDto toCreate) {
        ProfessorEntity createOrUpdateMe = new ProfessorEntity();
        createOrUpdateMe.setId(toCreate.getId());
        createOrUpdateMe.setCnp(toCreate.getCnp());
        createOrUpdateMe.setFirstname(toCreate.getFirstname());
        createOrUpdateMe.setLastname(toCreate.getLastname());
        this.professorRepository.save(createOrUpdateMe);

    }

    public void deleteProfessorById(Long professorId) {
        this.professorRepository.deleteById(professorId);

    }
}

