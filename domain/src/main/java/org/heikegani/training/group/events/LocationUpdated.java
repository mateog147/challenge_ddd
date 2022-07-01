package org.heikegani.training.group.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.heikegani.training.group.Location;
import org.heikegani.training.group.values.City;
import org.heikegani.training.group.values.LocationId;
import org.heikegani.training.group.values.Place;

public class LocationUpdated extends DomainEvent {

    private final LocationId locationId;
    private final City city;
    private final Place place;

    public LocationUpdated(LocationId entityId, City city, Place place) {
        super("heikegani.group.locationupdated");
        this.locationId = entityId;
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
