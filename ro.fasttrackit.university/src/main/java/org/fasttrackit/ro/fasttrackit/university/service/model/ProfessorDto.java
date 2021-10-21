package org.fasttrackit.ro.fasttrackit.university.service.model;

import java.util.Objects;

public class ProfessorDto extends HumanDto {
    private Long professorId;

    public Long getId() {
        return professorId;
    }

    public void setId(Long id) {
        this.professorId = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProfessorDto that = (ProfessorDto) o;
        return Objects.equals(professorId, that.professorId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(professorId);
    }
}
