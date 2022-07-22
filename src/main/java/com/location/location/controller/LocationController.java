package com.location.location.controller;

import com.location.location.entity.Location;
import com.location.location.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class LocationController {

    @Autowired
    private LocationService locationService;

    @RequestMapping( "/")
    public ModelAndView createLocation(){
        return new ModelAndView("create_location");
    }

    @RequestMapping(value = "/saveLocation")
    public ModelAndView saveLocation(@ModelAttribute("location")Location location, ModelMap modelMap){
         Location locationSaved= locationService.creatLocation(location);
        String msg = "Location saved with id: " + locationSaved.getId();
        modelMap.addAttribute("msg",msg);
        return new ModelAndView("create_location");
    }
}

