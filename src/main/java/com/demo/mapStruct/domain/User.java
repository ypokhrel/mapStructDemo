package com.demo.mapStruct.domain;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class User {
  private Long id;
  private String firstName;
  private String lastName;
  private Date dob;
  private Long ssn;
  private String email;
  private String phone;
  private char gender;
}
