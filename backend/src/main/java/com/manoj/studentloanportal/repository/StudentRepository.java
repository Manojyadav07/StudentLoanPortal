package com.manoj.studentloanportal.repository;

import com.manoj.studentloanportal.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {}
