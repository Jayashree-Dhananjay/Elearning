package com.cg.userservice.mapper;

import com.cg.userservice.dto.UserDto;
import com.cg.userservice.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AutoUserMapper {
    AutoUserMapper MAPPER = Mappers.getMapper(AutoUserMapper.class);
    UserDto mapToUserDto(User user);
    User mapToUser(UserDto userDto);
}
