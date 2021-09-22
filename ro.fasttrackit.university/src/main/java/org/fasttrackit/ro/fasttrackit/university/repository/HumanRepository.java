package org.fasttrackit.ro.fasttrackit.university.repository;

import org.fasttrackit.ro.fasttrackit.university.repository.dao.HumanEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HumanRepository extends JpaRepository<HumanEntity, Long> {
}
