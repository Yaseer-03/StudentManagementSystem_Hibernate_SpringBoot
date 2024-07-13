package com.example.StudentManagementSystem.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Student {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long rollNumber;
    private String name;
    private String percentage;
    private String branch;


    public Student() {
    }

    public Student(String branch, String name, String percentage, long rollNumber) {
        this.branch = branch;
        this.name = name;
        this.percentage = percentage;
        this.rollNumber = rollNumber;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPercentage() {
        return percentage;
    }

    public void setPercentage(String percentage) {
        this.percentage = percentage;
    }

    public long getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(long rollNumber) {
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "branch='" + branch + '\'' +
                ", rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", percentage='" + percentage + '\'' +
                '}';
    }
}
