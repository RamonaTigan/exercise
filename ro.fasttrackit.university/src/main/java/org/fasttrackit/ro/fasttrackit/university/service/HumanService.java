package org.fasttrackit.ro.fasttrackit.university.service;


import org.fasttrackit.ro.fasttrackit.university.repository.HumanRepository;
import org.fasttrackit.ro.fasttrackit.university.repository.dao.HumanEntity;
import org.fasttrackit.ro.fasttrackit.university.service.model.HumanDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class HumanService {

    private final HumanRepository humanRepository;

    public HumanService(HumanRepository humanRepository) {

        this.humanRepository = humanRepository;
    }

    public List<HumanDto> getAllHumans() {
        final List<HumanEntity> all = this.humanRepository.findAll();
        return all.stream()
                .map(humanEntity -> {
                    HumanDto createdHuman = new HumanDto();
                    createdHuman.setId(humanEntity.getId());
                    createdHuman.setCnp(humanEntity.getCnp());
                    createdHuman.setFirstname(humanEntity.getFirstname());
                    createdHuman.setLastname(humanEntity.getLastname());
                    return createdHuman;
                })
                .collect(Collectors.toList());
    }

    public HumanDto getById(Long id) {
        final Optional<HumanEntity> byId = this.humanRepository.findById(id);
        if (byId.isEmpty()) {
            return null;
        }
        HumanEntity humanEntity = byId.get();

        HumanDto humanDto = new HumanDto();
        humanDto.setId(humanEntity.getId());
        humanDto.setCnp(humanEntity.getCnp());
        humanDto.setFirstname(humanEntity.getFirstname());
        humanDto.setLastname(humanEntity.getLastname());
        return humanDto;
    }

    public void createOrUpdateHuman(HumanDto toCreate) {
        HumanEntity createOrUpdateMe = new HumanEntity();
        createOrUpdateMe.setId(toCreate.getId());
        createOrUpdateMe.setCnp(toCreate.getCnp());
        createOrUpdateMe.setFirstname(toCreate.getFirstname());
        createOrUpdateMe.setLastname(toCreate.getLastname());
        this.humanRepository.save(createOrUpdateMe);

    }

    public void deleteHumanById(Long id) {
        this.humanRepository.deleteById(id);

    }
}
