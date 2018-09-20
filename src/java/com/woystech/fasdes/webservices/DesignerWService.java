/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.woystech.fasdes.webservices;

import com.woystech.fasdes.dao.DesignerDao;
import com.woystech.fasdes.entities.Designer;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author lupitisa
 */
@Path("/designers")
public class DesignerWService {

    @EJB
    DesignerDao designerDao;

    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<Designer> findAll() {
        return designerDao.findAll();
    }

    @GET
    @Path("/{id}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Designer findById(@PathParam("id") Long id) {
        return designerDao.find(id);
    }
    
    @POST
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Designer create(Designer designer) {
        designerDao.create(designer);
        return designer;
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Designer edit(@PathParam("id") Long id, Designer designer) {
        return designerDao.update(designer);
    }
    
    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Long id) {
        designerDao.delete(id);
    }

}
