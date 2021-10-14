package com.zackCoding.department.controller;

import com.zackCoding.department.entity.Department;
import com.zackCoding.department.entity.User;
import com.zackCoding.department.service.DepartmentService;
import com.zackCoding.department.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class DepartmentUserController {

    @Autowired
    DepartmentService departmentService;
    @Autowired
    UserService userService;

    @PostMapping("/department")
    public void saveDepartment(@RequestBody Department dept){

         departmentService.saveDept(dept);


    }

    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable (value ="id")Long id){
        return departmentService.findDepById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteEntity(@PathVariable (value = "id") Long department_id){
            departmentService.deleteByIdDept(department_id);
            userService.deleteByIdUser(department_id);
            return "success";
        }
    }




