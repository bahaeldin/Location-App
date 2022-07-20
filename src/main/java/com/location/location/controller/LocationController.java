package com.location.location.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/locations") // http://localhost:8080/locations
public class LocationController {

    @RequestMapping(value = "/create-location")
    public String createLocation(){
        return "create_location";
    }
}

