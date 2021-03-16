package com.demo.mapStruct.service;

import com.demo.mapStruct.domain.Person;
import com.demo.mapStruct.dto.PersonDto;
import com.demo.mapStruct.mapper.PersonMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PersonServiceImpl implements PersonService{

  @Autowired
  PersonMapper personMapper;

  @Override
  public PersonDto getPersonDto(Person person) {
    return personMapper.mapPersonSimple(person);
  }

  @Override
  public PersonDto getPersonAdvanced(Person person) {
    return  personMapper.mapPersonAdvance(person);
  }

  @Override
  public List<PersonDto> getRandomPersonDtoList() {
    return null;
  }
}
