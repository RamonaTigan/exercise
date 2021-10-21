package org.fasttrackit.ro.fasttrackit.university.service;

import org.fasttrackit.ro.fasttrackit.university.repository.CoursesRepository;
import org.fasttrackit.ro.fasttrackit.university.repository.dao.CoursesEntity;
import org.fasttrackit.ro.fasttrackit.university.service.model.CoursesDto;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CoursesService {
    private final CoursesRepository coursesRepository;

    public CoursesService(CoursesRepository coursesRepository) {
        this.coursesRepository = coursesRepository;
    }

    public List<CoursesDto> getAllCourses() {
        final List<CoursesEntity> allCourses = this.coursesRepository.findAll();
        return allCourses.stream()
                .map(coursesEntity -> {
                    CoursesDto createdCourse = new CoursesDto();
                    createdCourse.setId(coursesEntity.getId());
                    createdCourse.setCourse_number(coursesEntity.getCourse_number());
                    createdCourse.setName(coursesEntity.getName());
                    return createdCourse;
                })
                .collect(Collectors.toList());
    }

    public CoursesDto getById(Long courseId) {
        final Optional<CoursesEntity> byId = this.coursesRepository.findById(courseId);
        if (byId.isEmpty()) {
            return null;
        }
        final CoursesEntity courseEntity = byId.get();
        CoursesDto courseDto = new CoursesDto();
        courseDto.setId(courseEntity.getId());
        courseDto.setCourse_number(courseEntity.getCourse_number());
        courseDto.setName(courseEntity.getName());
        return courseDto;
    }

    public void createOrUpdateCourse(CoursesDto toCreate) {
        CoursesEntity createOrUpdateMe = new CoursesEntity();
        createOrUpdateMe.setId(toCreate.getId());
        createOrUpdateMe.setCourse_number(toCreate.getCourse_number());
        createOrUpdateMe.setName(toCreate.getName());
        this.coursesRepository.save(createOrUpdateMe);
    }

    public void deleteCourseById(Long id) {
        this.coursesRepository.deleteById(id);
    }
}
