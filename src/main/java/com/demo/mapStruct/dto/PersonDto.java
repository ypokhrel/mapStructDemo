package com.demo.mapStruct.dto;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class PersonDto {

  private Integer uniqueId;
  private String first_name;
  private String last_name;
  private String email;
  private String phone;
  private String address1;
  private String address2;
  private String city;
  private String state;
  private String dob;
  private String balance;

}
