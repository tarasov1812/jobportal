package com.tarasov1812.jobportal.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "job_company")
public class JobCompany {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    private String logo;
    private String name;

    public JobCompany() {
    }

    public JobCompany(Integer id, String logo, String name) {
        Id = id;
        this.logo = logo;
        this.name = name;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "JobCompany{" +
                "Id=" + Id +
                ", logo='" + logo + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}