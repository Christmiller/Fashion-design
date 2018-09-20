/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.woystech.fasdes.web;

import com.woystech.fasdes.entities.Speciality;
import com.woystech.fasdes.services.SpecialityService;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author lupitisa
 */
@ManagedBean
@ViewScoped
public class SpecialityManagedBean {
    
    private Speciality speciality;
    @EJB
    private SpecialityService specialityService;
    private List<Speciality> specialitys;
    

    /**
     * Creates a new instance of SpecialityManagedBean
     */
    public SpecialityManagedBean() {
        speciality = new Speciality();
    }

    public Speciality getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }
    
    public void addSpeciality(){
        specialityService.create(speciality);
    }

    public List<Speciality> getSpecialitys() {
        return specialityService.findAll();
    }

    public void setSpecialitys(List<Speciality> specialitys) {
        this.specialitys = specialitys;
    }
    
    
    
}
