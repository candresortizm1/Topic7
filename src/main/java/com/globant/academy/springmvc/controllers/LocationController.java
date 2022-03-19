package com.globant.academy.springmvc.controllers;

import com.globant.academy.springmvc.entities.Location;
import com.globant.academy.springmvc.repositories.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/locations")
public class LocationController {

    @Autowired
    private LocationRepository locationRepository;

    @GetMapping
    public String getLocations(Model model) {
        List<Location> locations = (List<Location>) locationRepository.findAll();
        model.addAttribute("locations", locations);
        return "locations/index";
    }

    @GetMapping(path="/new")
    public String newLocation(Model model) {
        model.addAttribute("location", new Location());
        return "locations/addLocation";
    }

    @PostMapping
    public String addLocation(@ModelAttribute Location location, Model model) {
        model.addAttribute("location", location);
        locationRepository.save(location);
        return "locations/index";
    }
}
