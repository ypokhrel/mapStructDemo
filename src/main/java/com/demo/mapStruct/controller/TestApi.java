package com.demo.mapStruct.controller;


import com.demo.mapStruct.domain.Person;
import com.demo.mapStruct.dto.PersonDto;
import com.demo.mapStruct.dto.UserDto;
import com.demo.mapStruct.service.PersonService;
import com.demo.mapStruct.service.UserService;
import java.util.Collections;
import java.util.List;
import javax.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestApi {

  @Autowired
  UserService userService;

  @Autowired
  PersonService personService;

  @GetMapping("/{type}/{num}")
  public ResponseEntity<?> getUsers(@PathVariable("type") String type, @PathVariable("num") int num){
    List<UserDto> response = userService.getUserInfo(type, num);
    return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
  }

  @PostMapping("/personSimple")
  public ResponseEntity<?> getPersonSimple(@RequestBody Person person){
    PersonDto personDto = personService.getPersonDto(person);
    return new ResponseEntity<>(personDto, HttpStatus.ACCEPTED);
  }

  @PostMapping("/personAdvanced")
  public ResponseEntity<?> getPersonAdvanced(@RequestBody Person person){
    PersonDto personDto = personService.getPersonAdvanced(person);
    return new ResponseEntity<>(personDto, HttpStatus.ACCEPTED);
  }

}
