/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.woystech.fasdes.services.impl;

import com.woystech.fasdes.dao.BaseDao;
import com.woystech.fasdes.dao.SpecialityDao;
import com.woystech.fasdes.entities.Speciality;
import com.woystech.fasdes.services.SpecialityService;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author lupitisa
 */
@Stateless
public class SpecialityServiceImpl extends BaseServiceImpl<Speciality, Long> implements SpecialityService{
     @EJB
    private SpecialityDao specialityDao;

    @Override
    protected BaseDao<Speciality, Long> getDao() {
        return specialityDao;
    }
    
}
