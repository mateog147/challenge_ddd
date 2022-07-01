package org.heikegani.training.group.commands;

import co.com.sofka.domain.generic.Command;
import org.heikegani.training.group.values.City;
import org.heikegani.training.group.values.LocationId;
import org.heikegani.training.group.values.Place;

public class UpdateLocation extends Command {

    private final LocationId locationId;
    private final City city;
    private final Place place;

    public UpdateLocation(LocationId locationId, City city, Place place) {
        this.locationId = locationId;
        this.city = city;
        this.place = place;
    }

    public LocationId getLocationId() {
        return locationId;
    }

    public City getCity() {
        return city;
    }

    public Place getPlace() {
        return place;
    }
}
