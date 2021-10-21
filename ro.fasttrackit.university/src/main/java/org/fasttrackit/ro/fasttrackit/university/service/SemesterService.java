package org.fasttrackit.ro.fasttrackit.university.service;

import org.fasttrackit.ro.fasttrackit.university.repository.SemesterRepository;
import org.fasttrackit.ro.fasttrackit.university.repository.dao.SemesterEntity;
import org.fasttrackit.ro.fasttrackit.university.service.model.SemesterDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class SemesterService {
    private final SemesterRepository semesterRepository;

    public SemesterService(SemesterRepository semesterRepository) {
        this.semesterRepository = semesterRepository;}

    public List<SemesterDto> getAllSemesters() {
        final List<SemesterEntity> allSemesters = this.semesterRepository.findAll();
        return allSemesters.stream()
                .map(semesterEntity -> {
                    SemesterDto createdSemester = new SemesterDto();
                    createdSemester.setId(semesterEntity.getId());
                    createdSemester.setUniversity_dept(semesterEntity.getUniversity_dept());
                    createdSemester.setUniversity_year(semesterEntity.getUniversity_year());
                    createdSemester.setSemester_no(semesterEntity.getSemester_no());
                    createdSemester.setStart_date(semesterEntity.getStart_date());
                    createdSemester.setEnd_date(semesterEntity.getEnd_date());
                    return createdSemester;
                })
                .collect(Collectors.toList());
    }

    public List<SemesterDto> getSemesterById(Long id) {
        final Optional<SemesterEntity> semesterById = this.semesterRepository.findById(id);
        return semesterById.stream()
                .map(semesterEntity -> {
                    SemesterDto sortedSemester = new SemesterDto();
                    sortedSemester.setId(semesterEntity.getId());
                    sortedSemester.setUniversity_dept(semesterEntity.getUniversity_dept());
                    sortedSemester.setUniversity_year(semesterEntity.getUniversity_year());
                    sortedSemester.setSemester_no(semesterEntity.getSemester_no());
                    sortedSemester.setStart_date(semesterEntity.getStart_date());
                    sortedSemester.setEnd_date(semesterEntity.getEnd_date());
                    return sortedSemester;
                })
                .collect(Collectors.toList());

    }

    public void createOrUpdateSemester(SemesterDto toCreate) {
        SemesterEntity createOrUpdateMe = new SemesterEntity();
        createOrUpdateMe.setId(toCreate.getId());
        createOrUpdateMe.setUniversity_dept(toCreate.getUniversity_dept());
        createOrUpdateMe.setUniversity_year(toCreate.getUniversity_year());
        createOrUpdateMe.setSemester_no(toCreate.getSemester_no());
        createOrUpdateMe.setStart_date(toCreate.getStart_date());
        createOrUpdateMe.setEnd_date(toCreate.getEnd_date());
        this.semesterRepository.save(createOrUpdateMe);

    }

    public void deleteSemesterById(Long semesterId) {
        this.semesterRepository.deleteById(semesterId);

    }
}
