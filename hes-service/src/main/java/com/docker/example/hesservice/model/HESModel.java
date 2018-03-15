package com.docker.example.hesservice.model;

/**
 * Created by Aisha on 14.03.2018.
 */
public class HESModel {
    private String cityName;
    private Integer energyConsumption;
    private Integer coalConsumption;

    public HESModel(String cityName, Integer energyConsumption, Integer coalConsumption) {
        this.cityName = cityName;
        this.energyConsumption = energyConsumption;
        this.coalConsumption = coalConsumption;
    }

    public HESModel() {
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Integer getEnergyConsumption() {
        return energyConsumption;
    }

    public void setEnergyConsumption(Integer energyConsumption) {
        this.energyConsumption = energyConsumption;
    }

    public Integer getCoalConsumption() {
        return coalConsumption;
    }

    public void setCoalConsumption(Integer coalConsumption) {
        this.coalConsumption = coalConsumption;
    }
}
