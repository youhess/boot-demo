package com.tutorial.boot_demo.service;

import com.tutorial.boot_demo.dao.User;
import com.tutorial.boot_demo.dto.UserDTO;

public interface UserService {
    UserDTO getUserById(long id);

    long addNewUser(UserDTO userDTO) throws IllegalAccessException;
}
