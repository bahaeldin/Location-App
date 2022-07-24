package com.location.location.controller;


import com.location.location.entity.Location;
import com.location.location.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController

public class LocationController {

    @Autowired
    private LocationService locationService;

    @RequestMapping( "/create-location")
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

    @RequestMapping(value = "/displayAll")
    public ModelAndView displayLocations(ModelMap modelMap){
        List<Location> allLocations = locationService.getAllLocations();
        modelMap.addAttribute("locations",allLocations);
        return new ModelAndView("locations");
    }

    @RequestMapping(value = "/deletelocation{id}")
    public ModelAndView deleteLocation(@RequestParam long id,ModelMap modelMap){
        locationService.deleteLocation(id);
        List<Location> locations = locationService.getAllLocations();
        modelMap.addAttribute("locations" , locations);
        return new ModelAndView("locations");
    }

    @RequestMapping(value = "/editlocation")
    public ModelAndView editLocation(@RequestParam("id") long id, ModelMap modelMap){
        Location location = locationService.getLocationById(id);
        modelMap.addAttribute("location" , location);
        return new ModelAndView("editlocation");
    }

    @RequestMapping(value = "/updateLocation")
    public ModelAndView updateLocation(@ModelAttribute("location") Location location,ModelMap modelMap){
        locationService.creatLocation(location);
        List<Location> locations = locationService.getAllLocations();
        modelMap.addAttribute("locations" , locations);
        return new ModelAndView("locations");
    }


}

