package com.manoj.studentloanportal.dto;

import java.time.LocalDate;

public record StudentDTO(Long id, String name, LocalDate dob, String email, Double loanAmount) {}
