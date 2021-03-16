package com.demo.mapStruct.service;

import com.demo.mapStruct.domain.User;
import com.demo.mapStruct.dto.UserDto;
import com.demo.mapStruct.mapper.UserMapper;
import com.demo.mapStruct.mapper.UserMapperImpl;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  UserMapperImpl userMapper;


  public List<UserDto> getUserByNumber(int num, String type) {
    List<UserDto> list = new ArrayList<>();
    IntStream.range(0, num).forEach(index -> {
      User user = new User();
      user.setId(Long.valueOf(index));
      user.setFirstName("firstName-" + index);
      user.setLastName("lastName-" + index);
      user.setEmail("email" + index + "@hms.com");
      user.setPhone("phone-" + index);
      user.setDob(new Date());
      user.setGender(index % 2 == 0 ? 'm' : 'f');
      user.setSsn(new Random().nextLong());

      UserDto userDto = new UserDto();
      if(type.equalsIgnoreCase("m")) {
        userDto = userMapper.mapToUserDto(user);
      } else {
        BeanUtils.copyProperties(user, userDto);
      }
      list.add(userDto);
    });

    return list;
  }

  @Override
  public List<UserDto> getUserInfo(String type, int num) {
    return this.getUserByNumber(num, type);
  }
}
