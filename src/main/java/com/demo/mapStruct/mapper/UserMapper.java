package com.demo.mapStruct.mapper;

import com.demo.mapStruct.domain.User;
import com.demo.mapStruct.dto.UserDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

  UserDto mapToUserDto(User user);
}
