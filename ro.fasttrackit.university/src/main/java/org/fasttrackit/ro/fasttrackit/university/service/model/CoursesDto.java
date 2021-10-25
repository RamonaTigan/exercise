package org.fasttrackit.ro.fasttrackit.university.service.model;


import java.util.Objects;

public class CoursesDto {
    private Long courseId;
    private Long course_number;
    private String name;

    public Long getId() {
        return courseId;
    }

    public void setId(Long id) {
        this.courseId = id;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CoursesDto that = (CoursesDto) o;
        return Objects.equals(courseId, that.courseId) && Objects.equals(course_number, that.course_number) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseId, course_number, name);
    }

    @Override
    public String toString() {
        return "CoursesDto{" +
                "id=" + courseId +
                ", course_number=" + course_number +
                ", name='" + name + '\'' +
                '}';
    }
}
