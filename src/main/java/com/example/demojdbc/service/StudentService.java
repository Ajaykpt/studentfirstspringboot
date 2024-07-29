package com.example.demojdbc.service;

import com.example.demojdbc.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentrepository;

    List<StudentRepository> s = Arrays.asList(
            new StudentRepository(101,"aaa",12),
            new StudentRepository(102,"bbb",13)
    );

    public List<StudentRepository>Display(){
        return s;
    }
}
