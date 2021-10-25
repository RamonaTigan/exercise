package org.fasttrackit.ro.fasttrackit.university.repository.dao;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
public class ScheduledCourses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "professor_id")
    ProfessorEntity professor;
    @ManyToOne
    @JoinColumn(name = "course_id")
    CoursesEntity courses;
    @ManyToOne
    @JoinColumn(name = "semester_id")
    SemesterEntity semester;

    public ScheduledCourses(Long id, ProfessorEntity professor, CoursesEntity courses, SemesterEntity semester) {
        this.id = id;
        this.professor = professor;
        this.courses = courses;
        this.semester = semester;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ProfessorEntity getProfessor() {
        return professor;
    }

    public void setProfessor(ProfessorEntity professor) {
        this.professor = professor;
    }

    public CoursesEntity getCourses() {
        return courses;
    }

    public void setCourses(CoursesEntity courses) {
        this.courses = courses;
    }

    public SemesterEntity getSemester() {
        return semester;
    }

    public void setSemester(SemesterEntity semester) {
        this.semester = semester;
    }


}

