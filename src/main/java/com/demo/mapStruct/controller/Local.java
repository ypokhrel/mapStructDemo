package com.demo.mapStruct.controller;

import com.demo.mapStruct.domain.Address;
import com.demo.mapStruct.domain.Person;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import java.util.Date;

public class Local {

  public static void main(String[] args) throws JsonProcessingException {
    Address address = new Address();
    address.setId(1);
    address.setAddress1("1313 Meadow Creek");
    address.setAddress2("APT ###");
    address.setCity("Irving");
    address.setState("TX");

    Person person = new Person(1, "john", "doe", "someemai@hms.com", "1234567790", address,
        new Date(), 1234l);

    ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
    String json = ow.writeValueAsString(person);
    System.out.println(json);

  }

}
