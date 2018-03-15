package com.docker.example.hesservice.controller;


import com.docker.example.hesservice.model.HESModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;


/**
 * Created by Aisha on 14.03.2018.
 */

@RestController
@RequestMapping("/rest/hes")
@CrossOrigin({"http://localhost:8080","http://localhost:8301","http://localhost:8085","http://localhost:8301","http://localhost:8086"})
public class HESController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("list/{cityName}")
    public List<HESModel> getListHESModel (@PathVariable("cityName") final String cityName){

        return null;

    }
    @GetMapping("/hello")
    public  String sayHello(){
        return "hello Aisha";
    }


    @GetMapping("/calculation/{cityName}")
    public double getCoalConsumption(@PathVariable("cityName") final String cityName){

        ResponseEntity<Double> consumptionResponse = restTemplate.exchange("http://localhost:8085/rest/db/coalConsumption/" + cityName, HttpMethod.GET,
                null, new ParameterizedTypeReference<Double>() { });
        Double consumption = consumptionResponse.getBody();


        return consumption *0.25;
    }

}
