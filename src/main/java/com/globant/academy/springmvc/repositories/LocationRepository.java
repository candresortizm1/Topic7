package com.globant.academy.springmvc.repositories;

import com.globant.academy.springmvc.entities.Location;
import org.springframework.data.repository.CrudRepository;

public interface LocationRepository extends CrudRepository<Location,Integer> {

}
