package org.fasttrackit.ro.fasttrackit.university.service.model;


import java.util.Date;
import java.util.Objects;

public class SemesterDto {
    private Long semesterId;
    private String university_dept;
    private String university_year;
    private int semester_no;
    private Date start_date;
    private Date end_date;

    public Long getId() {
        return semesterId;
    }

    public void setId(Long id) {
        this.semesterId = id;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SemesterDto that = (SemesterDto) o;
        return semester_no == that.semester_no && Objects.equals(semesterId, that.semesterId) &&
                Objects.equals(university_dept, that.university_dept) &&
                Objects.equals(university_year, that.university_year) &&
                Objects.equals(start_date, that.start_date) &&
                Objects.equals(end_date, that.end_date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(semesterId, university_dept, university_year, semester_no, start_date, end_date);
    }
}
