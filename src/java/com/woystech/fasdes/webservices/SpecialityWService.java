/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.woystech.fasdes.webservices;

import com.woystech.fasdes.dao.SpecialityDao;
import com.woystech.fasdes.entities.Speciality;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author lupitisa
 */
@Path("/specialities")
public class SpecialityWService {

    @EJB
    private SpecialityDao specialityDao;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Speciality> findAll() {
        return specialityDao.findAll();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Speciality findById(@PathParam("id") Long id) {
        return specialityDao.find(id);
    }

    @POST
    @Path("/speciality/{name}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void createSpeciality(@PathParam("name") String name) {
        Speciality speciality = new Speciality(name);
        specialityDao.create(speciality);
    }

}
