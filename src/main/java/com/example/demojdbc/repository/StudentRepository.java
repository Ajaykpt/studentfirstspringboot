package com.example.demojdbc.repository;

import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {
    private int studentId;
    private String studentName;
    private int studentNo;

    // Default constructor
    public StudentRepository() {
    }

    // Optional: Constructor for initialization
    public StudentRepository(int studentId, String studentName, int studentNo) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentNo = studentNo;
    }

    // Getter and Setter methods
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(int studentNo) {
        this.studentNo = studentNo;
    }
}
