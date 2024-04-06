package com.jetbrains.cristi.notite.criptate.service;

import com.jetbrains.cristi.notite.criptate.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(Long id);
    User createUser(User user);
    User updateUser(Long id, String email, User user);
    void deleteUser(Long id);
}
