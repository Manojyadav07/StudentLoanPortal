package com.manoj.studentloanportal.service;

import com.manoj.studentloanportal.dto.StudentDTO;
import java.util.List;

public interface StudentService {
    List<StudentDTO> getAll();
    StudentDTO create(StudentDTO dto);
}
