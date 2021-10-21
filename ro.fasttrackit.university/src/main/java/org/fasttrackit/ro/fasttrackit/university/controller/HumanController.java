package org.fasttrackit.ro.fasttrackit.university.controller;

import org.fasttrackit.ro.fasttrackit.university.service.HumanService;
import org.fasttrackit.ro.fasttrackit.university.service.model.HumanDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HumanController {

    private final HumanService humanService;

    public HumanController(HumanService service) {
        this.humanService = service;
    }

    @GetMapping("/hello")
    public ResponseEntity<String> getSample() {
        return ResponseEntity.ok("There are no humans");
    }

    @GetMapping("/api/human")
    public ResponseEntity<List<HumanDto>> getAllHumans() {
        return ResponseEntity.ok(humanService.getAllHumans());
    }

    @GetMapping("/api/human/{id}")
    public ResponseEntity<HumanDto> getById(@PathVariable("id") Long humanId){
        return ResponseEntity.ok(humanService.getById(humanId));
    }

    @PostMapping("/api/human")
    public ResponseEntity createOrUpdateHuman(@RequestBody HumanDto humanRequest) {
        this.humanService.createOrUpdateHuman(humanRequest);
        return ResponseEntity.ok().build();
    }


    @DeleteMapping("/api/human/{id}")
    public void deleteHumanById(@PathVariable("id") Long humanId){
        this.humanService.deleteHumanById(humanId);

    }
}
