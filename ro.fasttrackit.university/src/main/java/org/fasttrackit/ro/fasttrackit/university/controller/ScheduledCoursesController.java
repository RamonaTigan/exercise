package org.fasttrackit.ro.fasttrackit.university.controller;

import org.fasttrackit.ro.fasttrackit.university.service.ScheduledCoursesService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScheduledCoursesController {
    private final ScheduledCoursesService scheduledCoursesService;

    public ScheduledCoursesController(ScheduledCoursesService scheduledCoursesService) {
        this.scheduledCoursesService = scheduledCoursesService;
    }

}
