package org.fasttrackit.ro.fasttrackit.university.service.model;

import java.util.Date;
import java.util.Objects;

public class MessageDto {

    Date schedulingDate;
    String professorName;
    String universityName;
    int semesterNo;
    int year;

    public MessageDto(Date schedulingDate, String professorName, String universityName, int semesterNo, int year) {
        this.schedulingDate = schedulingDate;
        this.professorName = professorName;
        this.universityName = universityName;
        this.semesterNo = semesterNo;
        this.year = year;
    }

    public Date getSchedulingDate() {
        return schedulingDate;
    }

    public void setSchedulingDate(Date schedulingDate) {
        this.schedulingDate = schedulingDate;
    }

    public String getProfessorName() {
        return professorName;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public int getSemesterNo() {
        return semesterNo;
    }

    public void setSemesterNo(int semesterNo) {
        this.semesterNo = semesterNo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MessageDto that = (MessageDto) o;
        return semesterNo == that.semesterNo && year == that.year && Objects.equals(schedulingDate, that.schedulingDate) && Objects.equals(professorName, that.professorName) && Objects.equals(universityName, that.universityName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schedulingDate, professorName, universityName, semesterNo, year);
    }

    @Override
    public String toString() {
        return "MessageDto{" +
                "schedulingDate=" + schedulingDate +
                ", professorName='" + professorName + '\'' +
                ", universityName='" + universityName + '\'' +
                ", semesterNo=" + semesterNo +
                ", year=" + year +
                '}';
    }
}
