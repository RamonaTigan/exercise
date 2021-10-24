package org.fasttrackit.ro.fasttrackit.university.service;

import org.fasttrackit.ro.fasttrackit.university.repository.StudentRepository;
import org.fasttrackit.ro.fasttrackit.university.repository.dao.StudentEntity;
import org.fasttrackit.ro.fasttrackit.university.service.model.StudentDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;}

    public List<StudentDto> getAllStudents() {
        final List<StudentEntity> allStudents = this.studentRepository.findAll();
        return allStudents.stream()
                .map(humanEntity -> {
                    StudentDto createdStudent = new StudentDto();
                    createdStudent.setId(humanEntity.getId());
                    createdStudent.setCnp(humanEntity.getCnp());
                    createdStudent.setFirstname(humanEntity.getFirstname());
                    createdStudent.setLastname(humanEntity.getLastname());
                    return createdStudent;
                })
                .collect(Collectors.toList());
    }

    public StudentDto getStudentById(Long id) {
        final Optional<StudentEntity> studentById = this.studentRepository.findById(id);
        if (studentById.isEmpty()){
            return null;}
        final StudentEntity studentEntity = studentById.get();
                    StudentDto sortedStudent = new StudentDto();
                    sortedStudent.setId(studentEntity.getId());
                    sortedStudent.setCnp(studentEntity.getCnp());
                    sortedStudent.setFirstname(studentEntity.getFirstname());
                    sortedStudent.setLastname(studentEntity.getLastname());
                    return sortedStudent;
    }

    public void createOrUpdateStudent(StudentDto toCreate) {
        StudentEntity createOrUpdateMe = new StudentEntity();
        createOrUpdateMe.setId(toCreate.getId());
        createOrUpdateMe.setCnp(toCreate.getCnp());
        createOrUpdateMe.setFirstname(toCreate.getFirstname());
        createOrUpdateMe.setLastname(toCreate.getLastname());
        this.studentRepository.save(createOrUpdateMe);

    }

    public void deleteStudentById(Long studentId) {
        this.studentRepository.deleteById(studentId);

    }
    }

