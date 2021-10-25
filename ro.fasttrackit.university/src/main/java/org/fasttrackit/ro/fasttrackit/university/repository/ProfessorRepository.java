package org.fasttrackit.ro.fasttrackit.university.repository;

import org.fasttrackit.ro.fasttrackit.university.repository.dao.ProfessorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository extends JpaRepository<ProfessorEntity, Long> {
}
