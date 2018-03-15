package com.docker.example.accountservice.model;

/**
 * Created by Aisha on 14.03.2018.
 */
public class AccountModel {

    private String cityName;
    private String countryName;
    private Double energyConsumption;
    private Double coalConsumption;
    private Double costCoal;
    private String currency;


    public AccountModel(String cityName, String countryName, Double energyConsumption, Double coalConsumption, Double costCoal, String currency) {
        this.cityName = cityName;
        this.countryName = countryName;
        this.energyConsumption = energyConsumption;
        this.coalConsumption = coalConsumption;
        this.costCoal = costCoal;
        this.currency = currency;
    }

    public AccountModel() {
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public Double getEnergyConsumption() {
        return energyConsumption;
    }

    public void setEnergyConsumption(Double energyConsumption) {
        this.energyConsumption = energyConsumption;
    }

    public Double getCoalConsumption() {
        return coalConsumption;
    }

    public void setCoalConsumption(Double coalConsumption) {
        this.coalConsumption = coalConsumption;
    }

    public Double getCostCoal() {
        return costCoal;
    }

    public void setCostCoal(Double costCoal) {
        this.costCoal = costCoal;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }


}
