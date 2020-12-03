package com.cicdDemo.cicdDemo.controller;


import com.cicdDemo.cicdDemo.Entity.Student;
import com.cicdDemo.cicdDemo.Entity.Teacher;
import com.cicdDemo.cicdDemo.service.StudentService;
import com.cicdDemo.cicdDemo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping(value = "/student")
    public void addStudent(@RequestBody Student student) {
        studentService.save(student);
    }
}
