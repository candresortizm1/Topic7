package com.globant.academy.springmvc.repositories;

import com.globant.academy.springmvc.entities.MeteorologicalEvent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MeeorologicalEventRepository extends JpaRepository<MeteorologicalEvent,Integer> {
}
