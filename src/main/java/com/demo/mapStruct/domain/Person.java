package com.demo.mapStruct.domain;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Person {

  private Integer id;
  private String f_name;
  private String l_name;
  private String email;
  private String phone;
  private Address address;
  private Date dob;
  private Long balance;

}
