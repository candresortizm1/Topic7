package com.globant.academy.springmvc.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.stream.Stream;

import static javax.persistence.GenerationType.IDENTITY;

@Entity(name="meteorological_event")
public class MeteorologicalEvent {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name="id",updatable = false)
    private int id;

    private LocalDate eventDate;

    @ManyToOne
    @JoinColumn(name="location_id", nullable=false)
    private Location location;

    private String temperature;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDate event_date) {
        this.eventDate = eventDate;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Float[] getTemperature() {
        Float[] temperatures = (Float[]) Arrays.stream(temperature.split(",")).map(Float::parseFloat).toArray();
        return temperatures;
    }

    public void setTemperature(Float[] temperature) {
        this.temperature = temperature.toString();
    }

}
