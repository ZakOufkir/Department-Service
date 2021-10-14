package com.zackCoding.department.service;

import com.zackCoding.department.entity.User;
import com.zackCoding.department.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;
    public void saveUser(User user) {

        userRepo.save(user);
    }

    public void deleteByIdUser(Long department_id) {
        userRepo.deleteById(department_id);
    }
}
