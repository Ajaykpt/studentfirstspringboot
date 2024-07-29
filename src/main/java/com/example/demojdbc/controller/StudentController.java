package com.example.demojdbc.controller;

import com.example.demojdbc.repository.StudentRepository;
import com.example.demojdbc.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

    @RestController
    @Controller
public class StudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping("/student")
    public List<StudentRepository> displayStudentDetails(){
        return studentService.Display();
    }

}
