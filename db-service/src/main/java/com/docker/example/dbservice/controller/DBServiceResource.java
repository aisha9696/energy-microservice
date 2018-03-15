package com.docker.example.dbservice.controller;

import com.docker.example.dbservice.model.City;
import com.docker.example.dbservice.model.Country;
import com.docker.example.dbservice.service.CityService;
import com.docker.example.dbservice.service.CountryService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;


/**
 * Created by Aisha on 13.03.2018.
 */

@RestController
@RequestMapping("/rest/db")
@CrossOrigin({"http://localhost:8080","http://localhost:8301","http://localhost:8085","http://localhost:8301","http://localhost:8086"})
public class DBServiceResource {
    private CityService cityService;
    private CountryService countryService;


    public DBServiceResource(CityService cityService,CountryService countryService) {
        this.cityService = cityService;
        this.countryService = countryService;
    }



    @GetMapping(value = "/country/{cityName}")
    public Country getCountryByCity(@PathVariable("cityName") final String cityName){
        return countryService.getCountriesById(cityService.findCityByCityName(cityName).getId_country());
    }

    @GetMapping("/coalConsumption/{cityName}")
    public Integer getCoalCunsumption(@PathVariable("cityName") final String cityName){
        return cityService.findCityByCityName(cityName).getEnergyConsumption();
    }

    @GetMapping("/hello")
    public  String sayHello(){
        return "hello Aisha";
    }

    @PostMapping("/add")
    public List<String> add(@RequestBody final Country countries){
        return null;
    }



}
