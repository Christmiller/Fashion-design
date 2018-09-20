/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.woystech.fasdes.webservices;

import com.woystech.fasdes.dao.UserDao;
import com.woystech.fasdes.entities.AppUser;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author lupitisa
 */
@Path("/users")
public class UserWService {

    @EJB
    UserDao userDao;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<AppUser> findAll() {
        return userDao.findAll();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public AppUser findById(@PathParam("id") Long id) {
        return userDao.find(id);
    }
    /* @POST
     @Path("/user/{name}")
     @Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
     public void createUser(@PathParam("name") String name){
     AppUser  user = new AppUser(name);
     userDao.create(user);
     }*/

}
