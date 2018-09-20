/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.woystech.fasdes.entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author lupitisa
 */
@Entity
@XmlRootElement
public class Designer extends AppUser{
    private String website;
    @OneToMany
    private List<Speciality> specialitys;

    public Designer() {
    }

    public Designer(String website, String userName, String password, String phoneNumber, String email, Address address) {
        super(userName, password, phoneNumber, email, address);
        this.website = website;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    @XmlTransient
    public List<Speciality> getSpecialitys() {
        return specialitys;
    }

    public void setSpecialitys(List<Speciality> specialitys) {
        this.specialitys = specialitys;
    }

    
    
}
