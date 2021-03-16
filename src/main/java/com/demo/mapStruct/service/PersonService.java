package com.demo.mapStruct.service;

import com.demo.mapStruct.domain.Person;
import com.demo.mapStruct.dto.PersonDto;
import java.util.List;

public interface PersonService {
  PersonDto getPersonDto(Person person);
  PersonDto getPersonAdvanced(Person person);
  List<PersonDto> getRandomPersonDtoList();
}
