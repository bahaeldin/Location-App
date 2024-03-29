package com.location.location.service;

import com.location.location.entity.Location;

import java.util.List;

public interface LocationService {

    public Location creatLocation(Location location);

    public Location updateLocation(Location location);

    public void deleteLocation(Location location);

    public Location getLocationById(long id);

    public List<Location> getAllLocations();


   public void deleteLocation(long id);
}
