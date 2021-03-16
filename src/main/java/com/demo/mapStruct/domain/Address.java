package com.demo.mapStruct.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Address {

  private Integer id;
  private String address1;
  private String address2;
  private String city;
  private String state;

}
