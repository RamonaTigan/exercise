package org.fasttrackit.ro.fasttrackit.university.repository.dao;

import javax.persistence.*;
import java.util.Set;

@Entity
public class ScheduledCourses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToMany
    @JoinColumn( name = "professor_id")
    Set<ProfessorEntity> professor;
    @ManyToMany
    @JoinColumn(name = "course_id")
    Set<CoursesEntity> courses;
    @ManyToMany
    @JoinColumn(name = "semester_id")
    Set<SemesterEntity> semester;
}
