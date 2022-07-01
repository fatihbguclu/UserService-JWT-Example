package com.jwt.userservice.service;

import com.jwt.userservice.domain.Role;
import com.jwt.userservice.domain.User;
import com.jwt.userservice.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {



    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User> getUsers();

}
