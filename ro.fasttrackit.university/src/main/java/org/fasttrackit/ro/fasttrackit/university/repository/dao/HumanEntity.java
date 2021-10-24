package org.fasttrackit.ro.fasttrackit.university.repository.dao;

import javax.persistence.*;

@Entity(name = "humans")
public class HumanEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String cnp;
    @Column
    private String lastname;
    @Column
    private String firstname;
    @OneToOne(mappedBy = "human")
    private ProfessorEntity professor;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
}
