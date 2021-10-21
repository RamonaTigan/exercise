package org.fasttrackit.ro.fasttrackit.university.repository.dao;


import javax.persistence.*;
import java.util.Set;

@Entity(name = "students")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    private HumanEntity human = new HumanEntity();
    @ManyToMany
    @JoinTable(
            name = "student_courses",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "scheduled_course_id"))
    Set<CoursesEntity> studentCourses;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Set<CoursesEntity> getStudentCourses() {
        return studentCourses;
    }

    public void setStudentCourses(Set<CoursesEntity> studentCourses) {
        this.studentCourses = studentCourses;
    }

    public HumanEntity getHuman() {
        return human;
    }

    public void setHuman(HumanEntity human) {
        this.human = human;
    }

    public String getCnp() {
        return this.human.getCnp();
    }

    public void setCnp(String cnp) {
        this.human.setCnp(cnp);
    }

    public String getLastname() {
        return this.human.getLastname();
    }

    public void setLastname(String lastname) {
        this.human.setLastname(lastname);
    }

    public String getFirstname() {
        return this.human.getFirstname();
    }

    public void setFirstname(String firstname) {
        this.human.setFirstname(firstname);
    }
}

