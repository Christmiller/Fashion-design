/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.woystech.fasdes.entities;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author lupitisa
 */
@Embeddable
public class Address implements Serializable{
    
    private String fullAdress;
    private String city;
    private String country;
    private String pincode;
    private String street;
    private int streetNumber;

    public Address() {
    }

    public Address(String city, String country, String pincode, String street, int streetNumber) {
        this.city = city;
        this.country = country;
        this.pincode = pincode;
        this.street = street;
        this.streetNumber = streetNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getFullAdress() {
        return fullAdress;
    }

    public void setFullAdress(String fullAdress) {
        this.fullAdress = fullAdress;
    }
    
    
    
    
}
