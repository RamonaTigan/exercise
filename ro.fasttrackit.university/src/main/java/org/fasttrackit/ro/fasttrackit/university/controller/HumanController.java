package org.fasttrackit.ro.fasttrackit.university.controller;

import org.fasttrackit.ro.fasttrackit.university.model.Human;
import org.fasttrackit.ro.fasttrackit.university.service.HumanService;
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

    @GetMapping("/api/getAll")
    public ResponseEntity<List<Human>> getAllHumans() {
        return ResponseEntity.ok(humanService.getAllHumans());
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<String> getHumanById(@PathVariable("id") Long humanId,
                                               @RequestParam() String searchingFor){
        return ResponseEntity.ok(humanService.getById(humanId) + searchingFor);
    }

    @PostMapping("/api/create")
    public ResponseEntity createOrUpdateHuman(@RequestBody Human humanRequest) {
        this.humanService.createOrUpdateHuman(humanRequest);
        return ResponseEntity.ok().build();
    }


    @DeleteMapping("/api/delete/{id}")
    public void deleteById(@PathVariable("id") Long humanId){
        this.humanService.deleteById(humanId);

    }
}
