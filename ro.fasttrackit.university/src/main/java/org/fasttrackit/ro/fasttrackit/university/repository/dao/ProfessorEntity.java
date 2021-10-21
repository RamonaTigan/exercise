package org.fasttrackit.ro.fasttrackit.university.repository.dao;

import javax.persistence.*;

@Entity(name = "professors")
public class ProfessorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private Long human_id;
    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    private HumanEntity humanEntity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getHuman_id() {
        return human_id;
    }

    public void setHuman_id(Long human_id) {
        this.human_id = human_id;
    }

    public HumanEntity getHumanEntity() {
        return humanEntity;
    }

    public void setHumanEntity(HumanEntity humanEntity) {
        this.humanEntity = humanEntity;
    }
    public String getCnp() {
        return this.humanEntity.getCnp();
    }

    public void setCnp(String cnp) {
        this.humanEntity.setCnp(cnp);
    }

    public String getLastname() {
        return this.humanEntity.getLastname();
    }

    public void setLastname(String lastname) {
        this.humanEntity.setLastname(lastname);
    }

    public String getFirstname() {
        return this.humanEntity.getFirstname();
    }

    public void setFirstname(String firstname) {
        this.humanEntity.setFirstname(firstname);
    }
}
