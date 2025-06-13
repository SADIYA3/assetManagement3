package com.example.assetmanagement3;

import jakarta.persistence.*;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;

    private String designation;

    public Employee() {
        // Default constructor required by JPA
    }

    public Employee(String fullName, String designation) {
        this.fullName = fullName;
        this.designation = designation;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}

