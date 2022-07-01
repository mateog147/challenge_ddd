package org.heikegani.training.group;

import co.com.sofka.domain.generic.Entity;
import org.heikegani.training.group.values.City;
import org.heikegani.training.group.values.LocationId;
import org.heikegani.training.group.values.Place;

import java.util.Objects;

public class Location extends Entity<LocationId> {
        private City city;
        private Place place;

    public Location(LocationId entityId,City city, Place place) {
        super(entityId);
        this.city = Objects.requireNonNull(city);
        this.place = Objects.requireNonNull(place);
    }

    public City city() {
        return city;
    }

    public void chageCity(City city) {
        this.city = Objects.requireNonNull(city) ;
    }

    public Place place() {
        return place;
    }

    public void changePlace(Place place) {
        this.place = Objects.requireNonNull(place);
    }
}
