/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.woystech.fasdes.dao.impl;

import com.woystech.fasdes.dao.SpecialityDao;
import com.woystech.fasdes.entities.Speciality;
import javax.ejb.Stateless;

/**
 *
 * @author lupitisa
 */
@Stateless
public class SpecialityDaoImpl extends BaseDaoImpl<Speciality, Long> implements SpecialityDao{
   
    public SpecialityDaoImpl(){
        super(Speciality.class);
        
    }
    
}
