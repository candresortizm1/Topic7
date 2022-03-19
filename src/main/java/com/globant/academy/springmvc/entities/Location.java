package com.globant.academy.springmvc.entities;

import javax.persistence.*;

import java.util.Set;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.GenerationType.IDENTITY;

@Entity(name="location")
public class Location {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name="id",updatable = false)
    private int id;

    @Column(name="latitud",nullable = false)
    private double latitud;

    @Column(name="longitud",nullable = false)
    private double longitud;

    @Column(name="city",nullable = false)
    private String city;

    @Column(name="state",nullable = false)
    private String state;

    @OneToMany(mappedBy="location", cascade = ALL)
    private Set<MeteorologicalEvent> events;

    public Set<MeteorologicalEvent> getEvents() {
        return events;
    }

    public void setEvents(Set<MeteorologicalEvent> events) {
        this.events = events;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Location{" +
                "id=" + id +
                ", latitud=" + latitud +
                ", longitud=" + longitud +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
