package com.cg.userservice.mapper;

import com.cg.userservice.dto.UserDto;
import com.cg.userservice.entity.User;

public class UserMapper {
    public  static UserDto mapToUserDto(User user){
        UserDto  userDto=new UserDto(

                user.getUserId(),
                user.getUserName(),
                user.getMentorName(),
                user.getStartDate(),
                user.getEndDate(),
                user.getWorkedHours()
        );
        return userDto;

    }
    public  static User mapToUser(UserDto userDto){
        User  user=new User(

                userDto.getUserId(),
                userDto.getUserName(),
                userDto.getMentorName(),
                userDto.getStartDate(),
                userDto.getEndDate(),
                userDto.getWorkedHours()
        );
        return user;

    }
}
