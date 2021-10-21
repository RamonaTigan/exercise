package org.fasttrackit.ro.fasttrackit.university.service.model;


import java.util.Objects;

public class HumanDto {
    private Long humanId;
    private String cnp;
    private String lastname;
    private String firstname;

    public Long getId() {
        return humanId;
    }

    public void setId(Long id) {
        this.humanId = id;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HumanDto humanDto = (HumanDto) o;
        return Objects.equals(humanDto, humanDto.humanId) && Objects.equals(cnp, humanDto.cnp) && Objects.equals(lastname, humanDto.lastname) && Objects.equals(firstname, humanDto.firstname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(humanId, cnp, lastname, firstname);
    }
}
