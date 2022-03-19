package com.globant.academy.springmvc.services;

import com.globant.academy.springmvc.repositories.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MetheorologycService {
    @Autowired
    private LocationRepository locationRepository;

}
