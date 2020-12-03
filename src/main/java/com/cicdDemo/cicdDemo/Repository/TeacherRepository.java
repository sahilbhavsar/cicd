package com.cicdDemo.cicdDemo.Repository;

import com.cicdDemo.cicdDemo.Entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}

