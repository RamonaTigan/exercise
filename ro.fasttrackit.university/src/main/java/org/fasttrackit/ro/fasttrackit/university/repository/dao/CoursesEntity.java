package org.fasttrackit.ro.fasttrackit.university.repository.dao;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity(name = "courses")
public class CoursesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private Long course_number;
    @Column
    private String name;
    @ManyToMany(mappedBy = "studentCourses")
    Set<StudentEntity> students;
    @OneToMany(mappedBy = "courses")
    Set<ScheduledCourses> scheduledCourses;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCourse_number() {
        return course_number;
    }

    public void setCourse_number(Long course_number) {
        this.course_number = course_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<StudentEntity> getStudents() {
        return students;
    }

    public void setStudents(Set<StudentEntity> students) {
        this.students = students;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CoursesEntity that = (CoursesEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(course_number, that.course_number) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, course_number, name);
    }
}
