package com.tutorial.boot_demo.converter;


import com.tutorial.boot_demo.dao.User;
import com.tutorial.boot_demo.dto.UserDTO;

//用于转换UserService层的对象 userDTO
public class UserConverter {

    public static UserDTO convertUser(User user){

        UserDTO userDTO = new UserDTO();

        userDTO.setId(user.getId());
        userDTO.setName(user.getName());


        return  userDTO;
    }

    public static User convertToUser(UserDTO userDTO){

        User user = new User();
//        user.setId(userDTO.getId());
        user.setName(userDTO.getName());
//        user.setEmail(userDTO.get);

        return  user;
    }
}
