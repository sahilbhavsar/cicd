package com.cicdDemo.cicdDemo.controller;

import com.cicdDemo.cicdDemo.Entity.Teacher;
import com.cicdDemo.cicdDemo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @PostMapping(value="/teacher")
    public void addTeacher(@RequestBody Teacher teacher){
        teacherService.save(teacher);
    }


}
