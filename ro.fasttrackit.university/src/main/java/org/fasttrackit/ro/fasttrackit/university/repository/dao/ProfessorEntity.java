package org.fasttrackit.ro.fasttrackit.university.repository.dao;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "professors")
public class ProfessorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "human_id", referencedColumnName = "id")
    private HumanEntity human = new HumanEntity();
    @OneToMany( mappedBy = "professor")
    Set<ScheduledCourses> scheduledCourses;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public HumanEntity getHuman() {
        return human;
    }

    public void setHuman(HumanEntity human) {
        this.human = human;
    }
    public String getCnp() {return this.human.getCnp();}

    public void setCnp(String cnp) {
        this.human.setCnp(cnp);
    }

    public String getLastname() {
        return this.human.getLastname();
    }

    public void setLastname(String lastname) {
        this.human.setLastname(lastname);
    }

    public String getFirstname() {
        return this.human.getFirstname();
    }

    public void setFirstname(String firstname) {
        this.human.setFirstname(firstname);
    }
}
