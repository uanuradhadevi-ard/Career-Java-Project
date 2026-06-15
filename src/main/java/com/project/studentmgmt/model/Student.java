package com.project.studentmgmt.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    private Long id;
    private String name;
    private String email;

    public Long getId() {
        return id;
    }

}