package com.bridgelabz.restapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiController {

    @RequestMapping(value = {"/hello"},method = RequestMethod.GET)
    public String showHello(){
        return "Hello from BridgeLabz! \n"
    }
}
