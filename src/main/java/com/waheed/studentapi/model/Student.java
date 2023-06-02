package com.waheed.studentapi.model;
import jakarta.persistence.*;


@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    private String name;
    private String stage;
    private int grade;

    // Constructors, getters, and setters
}