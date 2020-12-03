package com.cicdDemo.cicdDemo.Repository;

import com.cicdDemo.cicdDemo.Entity.Student;
import com.cicdDemo.cicdDemo.Entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}

