package com.allproject.recap.services;

import com.allproject.recap.domain.User;

import java.util.List;

public interface UserService {

    User addUser(User user);

    List<User> getAllUsers();

    void deleteUserById(Long id);
}
