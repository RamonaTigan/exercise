package org.fasttrackit.ro.fasttrackit.university.service;

import org.fasttrackit.ro.fasttrackit.university.model.Human;
import org.fasttrackit.ro.fasttrackit.university.repository.HumanRepository;
import org.fasttrackit.ro.fasttrackit.university.repository.dao.HumanEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class HumanService {

    private final HumanRepository humanRepository;

    public HumanService(HumanRepository humanRepository) {
        this.humanRepository = humanRepository;
    }

    public List<Human> getAllHumans(){
        final List<HumanEntity> all = this.humanRepository.findAll();
        return all.stream()
                .map(humanEntity -> {
                    Human createdHuman = new Human();
                    createdHuman.setId(humanEntity.getId());
                    createdHuman.setCnp(humanEntity.getCnp());
                    createdHuman.setFirstname(humanEntity.getFirstname());
                    createdHuman.setLastname(humanEntity.getLastname());
                    return createdHuman;
                })
                .collect(Collectors.toList());
    }
    public List<Human> getById(Long id){
        final Optional<HumanEntity> byId = this.humanRepository.findById(id);
        return byId.stream()
                .map(humanEntity -> {
                    Human sortedHuman = new Human();
                    sortedHuman.setId(humanEntity.getId());
                    sortedHuman.setCnp(humanEntity.getCnp());
                    sortedHuman.setFirstname(humanEntity.getFirstname());
                    sortedHuman.setLastname(humanEntity.getLastname());
                    return sortedHuman;
                })
                .collect(Collectors.toList());

    }

    public void createOrUpdateHuman(Human toCreate){
        HumanEntity createOrUpdateMe = new HumanEntity();
        createOrUpdateMe.setId(toCreate.getId());
        createOrUpdateMe.setCnp(toCreate.getCnp());
        createOrUpdateMe.setFirstname(toCreate.getFirstname());
        createOrUpdateMe.setLastname(toCreate.getLastname());
        this.humanRepository.save(createOrUpdateMe);

    }

   public void deleteById(Long id){
      this.humanRepository.deleteById(id);

    }
}
