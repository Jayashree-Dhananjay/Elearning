package com.cg.userservice.service;

import com.cg.userservice.dto.UserDto;

import java.util.List;

public interface UserService {
    UserDto saveUser(UserDto userDto);

    UserDto getUserById(Long userId);
    List<UserDto> getAllUsers();

    UserDto updateUser(UserDto userDto);

    void  deleteUser(Long userId);
}
