package com.docker.example.accountservice.repository;

import com.docker.example.accountservice.model.AccountModel;



import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.json.JsonParser;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

/**
 * Created by Aisha on 14.03.2018.
 */

@Repository
public class AccountRepository {
    @Autowired
    RestTemplate restTemplate;

    public AccountModel generateAccount(String cityName){

        ResponseEntity<Double> calculationResponse = restTemplate.exchange("http://localhost:8301/rest/hes/calculation/" + cityName, HttpMethod.GET,
                null, new ParameterizedTypeReference<Double>() { });
        Double calculation = calculationResponse.getBody();

        ResponseEntity<String> countryResponse = restTemplate.exchange("http://localhost:8085/rest/db/country/" + cityName, HttpMethod.GET,
                null, new ParameterizedTypeReference<String>() { });
        String country = countryResponse.getBody();

        ResponseEntity<Double> consumptionResponse = restTemplate.exchange("http://localhost:8085/rest/db/coalConsumption/" + cityName, HttpMethod.GET,
                null, new ParameterizedTypeReference<Double>() { });
        Double energyConsumption = consumptionResponse.getBody();

        JSONObject jsonObject = new JSONObject(country);

        AccountModel accountModel = new AccountModel(cityName,jsonObject.getString("nameCountry"),
                energyConsumption,
                calculation,
                calculation * jsonObject.getDouble("costCoal"),
                jsonObject.getString("currency"));
        return accountModel;
    }
}
