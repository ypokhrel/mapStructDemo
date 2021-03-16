package com.demo.mapStruct.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller()
public class HomeController {

  @RequestMapping(value = "/", method = GET)
  public String home(Model model) {
    return "index";
  }


}
