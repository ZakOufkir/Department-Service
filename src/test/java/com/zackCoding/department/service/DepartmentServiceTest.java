package com.zackCoding.department.service;

import com.zackCoding.department.entity.Department;
import com.zackCoding.department.repository.DepartmentRepo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
@SpringBootTest
class DepartmentServiceTest {

    @Autowired
    private DepartmentService departmentService;

    @MockBean
    private DepartmentRepo departmentRepo;

    @BeforeEach
    void setUp() {
        Department department= Department.builder().departmentId(1L)
            .departmentAddress("HayHassanei").departmentCode("IT-54").departmentName("IT")
            .build();
        Mockito.when(departmentRepo.findById(1L)).thenReturn(java.util.Optional.ofNullable(department));

    }

    @Test
    @DisplayName("Get department based on department Id")
    public void whendepartmentId_thenFound(Long id){

        Department found = departmentService.findDepById(id);



    }
}