package org.fasttrackit.ro.fasttrackit.university.repository.dao;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;
import java.util.Set;

@Entity(name = "semester")
public class SemesterEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String university_dept;
    @Column
    private String university_year;
    @Column
    private int semester_no;
    @Column
    private Date start_date;
    @Column
    private Date end_date;
    @ManyToMany(mappedBy = "semester")
    Set<ScheduledCourses> courses;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SemesterEntity that = (SemesterEntity) o;
        return semester_no == that.semester_no && Objects.equals(id, that.id) && Objects.equals(university_dept, that.university_dept) && Objects.equals(university_year, that.university_year) && Objects.equals(start_date, that.start_date) && Objects.equals(end_date, that.end_date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, university_dept, university_year, semester_no, start_date, end_date);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUniversity_dept() {
        return university_dept;
    }

    public void setUniversity_dept(String university_dept) {
        this.university_dept = university_dept;
    }

    public String getUniversity_year() {
        return university_year;
    }

    public void setUniversity_year(String university_year) {
        this.university_year = university_year;
    }

    public int getSemester_no() {
        return semester_no;
    }

    public void setSemester_no(int semester_no) {
        this.semester_no = semester_no;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }


}
