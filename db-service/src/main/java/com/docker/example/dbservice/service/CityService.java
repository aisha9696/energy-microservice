package com.docker.example.dbservice.service;

import com.docker.example.dbservice.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Aisha on 13.03.2018.
 */

@Repository
public interface CityService extends JpaRepository<City, Integer>{

    City findCityByCityName (String cityName);
}
