package com.manoj.studentloanportal.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.manoj.studentloanportal.dto.StudentDTO;
import com.manoj.studentloanportal.service.StudentService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(StudentController.class)
class StudentControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private StudentService service;

    @Test
    void listStudents() throws Exception {
        Mockito.when(service.getAll()).thenReturn(List.of(new StudentDTO(1L,"J",null,null,0.0)));
        mockMvc.perform(get("/api/v1/students"))
                .andExpect(status().isOk());
    }
}
