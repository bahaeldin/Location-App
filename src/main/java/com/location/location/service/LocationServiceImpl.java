package com.location.location.service;

import com.location.location.entity.Location;
import com.location.location.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationServiceImpl implements LocationService{

    @Autowired
    private LocationRepository locationRepository;

    @Override
    public Location creatLocation(Location location) {
        return null;
    }

    @Override
    public Location updateLocation(Location location) {
        return null;
    }

    @Override
    public void deleteLocationById(Location location) {

    }

    @Override
    public Location getLocationById(long id) {
        return null;
    }

    @Override
    public List<Location> getAllLocations() {
        return null;
    }
}
