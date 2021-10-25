package org.fasttrackit.ro.fasttrackit.university.repository;

import org.fasttrackit.ro.fasttrackit.university.repository.dao.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Long> {
}
