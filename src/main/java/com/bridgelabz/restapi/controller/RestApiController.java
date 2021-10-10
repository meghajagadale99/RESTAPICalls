package com.bridgelabz.restapi.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class RestApiController {

    @RequestMapping(value = {"/hello"},method = RequestMethod.GET)
    public String showHello(){
        return "Hello from BridgeLabz! \n";
    }

    @RequestMapping(value = {"/hello/message"}, method = RequestMethod.GET)
    public String helloQuery(@RequestParam(value = "name") String name) {
        return "Hello " + name + " from BridgeLabz!\n";
    }

    @GetMapping(value = {"/hello/message/{name}"})
    public String helloPathParam(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz!\n";
    }
}
