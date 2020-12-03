package com.cicdDemo.cicdDemo.service;

import com.cicdDemo.cicdDemo.Entity.Student;
import com.cicdDemo.cicdDemo.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void save(Student student) {
        studentRepository.save(student);
    }
}
