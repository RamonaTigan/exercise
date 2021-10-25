package org.fasttrackit.ro.fasttrackit.university.service;

import org.fasttrackit.ro.fasttrackit.university.repository.CoursesRepository;
import org.fasttrackit.ro.fasttrackit.university.repository.ProfessorRepository;
import org.fasttrackit.ro.fasttrackit.university.repository.ScheduledCoursesRepository;
import org.fasttrackit.ro.fasttrackit.university.repository.SemesterRepository;
import org.springframework.stereotype.Service;

@Service
public class ScheduledCoursesService {
    private final ScheduledCoursesRepository scheduledCoursesRepository;


    public ScheduledCoursesService(ScheduledCoursesRepository scheduledCoursesRepository) {
        this.scheduledCoursesRepository = scheduledCoursesRepository;

    }

   public void saveScheduledCourse(long course_id, long professor_id, long semester_id){
   }

}
