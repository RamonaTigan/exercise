package org.fasttrackit.ro.fasttrackit.university.repository;

import org.fasttrackit.ro.fasttrackit.university.repository.dao.SemesterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SemesterRepository extends JpaRepository<SemesterEntity, Long> {
}
