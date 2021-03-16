package com.demo.mapStruct.service;

import com.demo.mapStruct.dto.UserDto;
import java.util.List;

public interface UserService {

  List<UserDto> getUserInfo(String type, int num);

}
