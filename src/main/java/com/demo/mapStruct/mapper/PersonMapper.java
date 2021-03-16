package com.demo.mapStruct.mapper;

import com.demo.mapStruct.domain.Person;
import com.demo.mapStruct.dto.PersonDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface PersonMapper {

  @Mappings({
      @Mapping(source = "person.id", target = "uniqueId"),
      @Mapping(source = "person.f_name", target = "first_name"),
      @Mapping(source = "person.l_name", target = "last_name"),
  })
  PersonDto mapPersonSimple(Person person);

  @Mappings({
      @Mapping(source = "person.id", target = "uniqueId"),
      @Mapping(source = "person.f_name", target = "first_name"),
      @Mapping(source = "person.l_name", target = "last_name"),

      //custom formatter
      @Mapping(source = "balance", target = "balance", numberFormat = "$#.00"),
      @Mapping(source = "person.dob", target = "dob", dateFormat = "dd-MMM-yyyy"),

      //advanced controlled mapping
      @Mapping(expression = "java(getCustomString(person.getAddress().getAddress1()))", target = "address1"),
      @Mapping(expression = "java(getCustomString(person.getAddress().getAddress2()))", target = "address2"),
      @Mapping(expression = "java(getCustomString(person.getAddress().getCity()))", target = "city"),
      @Mapping(expression = "java(getCustomString(person.getAddress().getState()))", target = "state"),
  })
  PersonDto mapPersonAdvance(Person person);

  default String getCustomString(String text) {
    return text;
  }
}
