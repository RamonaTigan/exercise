package org.fasttrackit.ro.fasttrackit.university.repository;

import org.fasttrackit.ro.fasttrackit.university.repository.dao.ScheduledCourses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ScheduledCoursesRepository extends JpaRepository<ScheduledCourses, Long> {
    @Modifying
    @Query("insert into scheduled_courses (course_id, professor_id, semester_id) values (?, ?, ?)")
    void saveScheduledCourse(@Param("course_id") long course_id, @Param("professor_id") long professor_id, @Param("semester_id") long semester_id);
}

