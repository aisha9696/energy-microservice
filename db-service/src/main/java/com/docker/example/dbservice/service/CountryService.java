package com.docker.example.dbservice.service;

import com.docker.example.dbservice.model.City;
import com.docker.example.dbservice.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

/**
 * Created by Aisha on 14.03.2018.
 */
@Repository
public interface CountryService extends JpaRepository<Country, Integer> {


    Country getCountriesById(Integer id);
}
