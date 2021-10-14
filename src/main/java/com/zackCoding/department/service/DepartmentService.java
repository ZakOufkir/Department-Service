package com.zackCoding.department.service;

import com.zackCoding.department.entity.Department;
import com.zackCoding.department.entity.User;
import com.zackCoding.department.repository.DepartmentRepo;
import com.zackCoding.department.repository.UserRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DepartmentService {

    private final Logger logger = LoggerFactory.getLogger(DepartmentService.class);

    @Autowired
    DepartmentRepo departmentRepo;
    @Autowired
    UserRepo userRepo;


    public void saveDept(Department department) {

            departmentRepo.save(department);

    }


    public  Department findDepById(Long id) {

        Department dept = null;

        Optional<Department> dep = departmentRepo.findById(id);
        if (dep.isPresent()) {
            dept = dep.get();


        }
        return dept;

    }


    public void deleteByIdDept(Long department_id) {

        departmentRepo.deleteById(department_id);
    }

    public void saveUser(User user) {


        userRepo.save(user);



    }
}
