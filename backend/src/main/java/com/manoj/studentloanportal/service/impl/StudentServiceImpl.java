package com.manoj.studentloanportal.service.impl;

import com.manoj.studentloanportal.dto.StudentDTO;
import com.manoj.studentloanportal.model.Student;
import com.manoj.studentloanportal.repository.StudentRepository;
import com.manoj.studentloanportal.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository repo;

    public StudentServiceImpl(StudentRepository repo) {
        this.repo = repo;
    }

    @Override
    public List<StudentDTO> getAll() {
        return repo.findAll().stream()
                .map(s -> new StudentDTO(s.getId(), s.getName(), s.getDob(), s.getEmail(), s.getLoanAmount()))
                .collect(Collectors.toList());
    }

    @Override
    public StudentDTO create(StudentDTO dto) {
        Student s = new Student();
        s.setName(dto.name());
        s.setDob(dto.dob());
        s.setEmail(dto.email());
        s.setLoanAmount(dto.loanAmount());
        Student saved = repo.save(s);
        return new StudentDTO(saved.getId(), saved.getName(), saved.getDob(), saved.getEmail(), saved.getLoanAmount());
    }
}
