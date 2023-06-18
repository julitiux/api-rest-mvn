package com.apirestmvn.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RequestMapController {

  @RequestMapping("/simpleMapping/path")
  public @ResponseBody String path() {
    return "mapping by path";
  }

  @RequestMapping(value = "/simpleMapping/method", method = RequestMethod.GET)
  public @ResponseBody String byMethod() {
    return "mapping by path + method";
  }

}
