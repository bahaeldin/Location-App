package com.location.location.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
//@RequestMapping(path = "/locations") // http://localhost:8080/locations
public class LocationController {

    @RequestMapping( "/")
    public ModelAndView createLocation(){

        return new ModelAndView("create_location");
    }
}

