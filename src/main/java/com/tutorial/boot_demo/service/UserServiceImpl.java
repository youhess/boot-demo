package com.tutorial.boot_demo.service;


import com.tutorial.boot_demo.converter.UserConverter;
import com.tutorial.boot_demo.dao.User;
import com.tutorial.boot_demo.dao.UserRepository;
import com.tutorial.boot_demo.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDTO getUserById(long id) {
        User user =  userRepository.findById(id).orElseThrow(RuntimeException::new);

        return UserConverter.convertUser(user);
    }

    @Override
    public long addNewUser(UserDTO userDTO) throws IllegalAccessException {
        List<User> userList =  userRepository.findByName(userDTO.getName());

        if(!CollectionUtils.isEmpty(userList)){
            throw new IllegalAccessException("name:" + userDTO.getName()+"has been taken");

        }
        User user = userRepository.save(UserConverter.convertToUser(userDTO));

        return user.getId();
    }
}
