package ua.lviv.lgs.Domain;


import org.springframework.context.annotation.Bean;

import javax.persistence.*;

@Entity
@Table(name = "univercity")
public class Univercity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    private String name;
    @Column
    private Integer levelOfAccreditation;
    @Column
    private Integer countOfInstitutes;
    @Column
    private Integer countOfStudents;
    @Column
    private String address;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCountOfInstitutes() {
        return countOfInstitutes;
    }

    public void setCountOfInstitutes(Integer countOfInstitutes) {
        this.countOfInstitutes = countOfInstitutes;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getCountOfStudents() {
        return countOfStudents;
    }

    public void setCountOfStudents(Integer countOfStudents) {
        this.countOfStudents = countOfStudents;
    }

    public Integer getLevelOfAccreditation() {
        return levelOfAccreditation;
    }

    public void setLevelOfAccreditation(Integer levelOfAccreditation) {
        this.levelOfAccreditation = levelOfAccreditation;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Univercity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", levelOfAccreditation=" + levelOfAccreditation +
                ", countOfInstitutes=" + countOfInstitutes +
                ", countOfStudents=" + countOfStudents +
                ", address='" + address + '\'' +
                '}';
    }
}
