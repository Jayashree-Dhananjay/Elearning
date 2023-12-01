package com.cg.userservice.service.impl;

import com.cg.userservice.dto.UserDto;
import com.cg.userservice.entity.User;
import com.cg.userservice.mapper.AutoUserMapper;
import com.cg.userservice.mapper.UserMapper;
import com.cg.userservice.repository.UserRepository;
import com.cg.userservice.service.UserService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    //private ModelMapper modelMapper;

    @Override
    public UserDto saveUser(UserDto userDto) {

        User user= UserMapper.mapToUser(userDto);

        User savedUser =userRepository.save(user);
        UserDto saveduserDto=UserMapper.mapToUserDto(savedUser);

        return saveduserDto;
    }

    @Override
    public UserDto getUserById(Long userId) {
        User user = userRepository.findByUserId(userId);

        UserDto userDto = UserMapper.mapToUserDto(user);

        return userDto;

    }

    @Override
    public List<UserDto> getAllUsers() {
        List<User> users = userRepository.findAll();
        return users.stream().map(UserMapper::mapToUserDto).collect(Collectors.toList());

    }
    @Override
    public UserDto updateUser(UserDto user) {
        User existingUser = userRepository.findById(user.getUserId()).orElseThrow(
                // ()-> new ResourceNotFoundException("User", "id", user.getId())
        );
        existingUser.setUserName(user.getUserName());
        existingUser.setMentorName(user.getMentorName());
        existingUser.setEndDate(user.getStartDate());
        existingUser.setEndDate(user.getEndDate());
        existingUser.setWorkedHours(user.getWorkedHours());
        User updatedUser = userRepository.save(existingUser);
//        return UserMapper.mapToUserDto(updatedUser);
        //return modelMapper.map(updatedUser, UserDto.class);
        return AutoUserMapper.MAPPER.mapToUserDto(updatedUser);

    }

    @Override
    public void deleteUser(Long userId) {
        User existingUser = userRepository.findById(userId).orElseThrow(
                // ()-> new ResourceNotFoundException("User", "id", userId)
        );
        userRepository.deleteById(userId);


    }
}
