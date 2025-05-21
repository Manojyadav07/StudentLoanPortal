package com.manoj.studentloanportal.service;

import com.manoj.studentloanportal.dto.StudentDTO;
import com.manoj.studentloanportal.model.Student;
import com.manoj.studentloanportal.repository.StudentRepository;
import com.manoj.studentloanportal.service.impl.StudentServiceImpl;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(MockitoExtension.class)
class StudentServiceTest {

    @Mock
    StudentRepository repo;

    @InjectMocks
    StudentServiceImpl service;

    @Test
    void createsStudent() {
        Student s = new Student();
        s.setName("John");
        when(repo.save(any())).thenReturn(s);

        StudentDTO dto = service.create(new StudentDTO(null, "John", null, null, 0.0));
        assertEquals("John", dto.name());
    }
}
