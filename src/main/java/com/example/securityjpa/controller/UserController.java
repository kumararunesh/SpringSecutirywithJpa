package com.example.securityjpa.controller;

import com.example.securityjpa.models.student;
import com.example.securityjpa.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    StudentRepo studentRepo;

    @GetMapping("/")
    public String getPublicPage()
    {
        return "<h1>Public Page</h1>";
    }

    @GetMapping("/user")
    public String getUserPage()
    {
        return "<h1>User Page</h1>";
    }

    @GetMapping("/admin")
    public String getAdminPage()
    {
        return "<h1>Admin Page</h1>";
    }

    @GetMapping("/student")
    public String addStudents()
    {
        student stud1 = new student();
        studentRepo.save(stud1);
        return "<h2>done</h2>";

    }

    @GetMapping("/getstudents")
    public List<student> getStudents()
    {
        List<student> sl = new ArrayList<student>();
        studentRepo.findAll().forEach(sl::add);
        return sl;

    }


}
