package com.docker.example.dbservice.model;

import javax.persistence.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Aisha on 13.03.2018.
 */

@Entity
@Table(name = "Country")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id_country")
    private Integer id;
    @Column(name = "nameCountry")
    private String nameCountry;
    @Column(name = "currency")
    private String currency;
    @Column(name = "costCoal")
    private Float costCoal;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "Id_country" , referencedColumnName = "Id_country")
    private List<City> cities ;




    public Country() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameCountry() {
        return nameCountry;
    }

    public void setNameCountry(String nameCountry) {
        this.nameCountry = nameCountry;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Float getCostCoal() {
        return costCoal;
    }

    public void setCostCoal(Float costCoal) {
        this.costCoal = costCoal;
    }

}
