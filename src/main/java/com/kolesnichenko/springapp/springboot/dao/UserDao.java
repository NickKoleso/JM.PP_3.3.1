package com.kolesnichenko.springapp.springboot.dao;


import com.kolesnichenko.springapp.springboot.model.User;

import java.util.List;

public interface UserDao {

    void addUser(User user);

    void updateUser(User user);

    void deleteUserById(int id);

    User getUserById(int id);

    List<User> getUsers();

    User getUserByName(String name);
}
