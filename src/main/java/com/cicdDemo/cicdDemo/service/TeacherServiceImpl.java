package com.cicdDemo.cicdDemo.service;

import com.cicdDemo.cicdDemo.Entity.Teacher;
import com.cicdDemo.cicdDemo.Repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    @Override
    public void save(Teacher teacher) {
        teacherRepository.save(teacher);
    }
}
