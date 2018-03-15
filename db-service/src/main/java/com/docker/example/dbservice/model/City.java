package com.docker.example.dbservice.model;

import javax.persistence.*;

/**
 * Created by Aisha on 13.03.2018.
 */

@Entity
@Table(name = "City")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer id;
    @Column(name = "cityName")
    private String cityName;
    @Column(name = "energyConsumption")
    private Integer energyConsumption;

    //@JoinColumn(name = "ID_Country", nullable = false)
    @Column(name = "Id_country")
    private Integer Id_country;


    public City(String cityName, Integer energyConsumption, Integer id_country) {
        this.cityName = cityName;
        this.energyConsumption = energyConsumption;
        Id_country = id_country;
    }

    public City() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getId_country() {
        return Id_country;
    }

    public void setId_country(Integer id_country) {
        Id_country = id_country;
    }
}



