/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.woystech.fasdes.webservices;

import com.woystech.fasdes.dao.FollowDao;
import com.woystech.fasdes.entities.Follow;
import com.woystech.fasdes.entities.FollowId;
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
@Path("/follows")
public class FollowWService {
    
    @EJB
    FollowDao followDao;
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Follow> findAll() {
        return followDao.findAll();
    }
    
    @GET
    @Path("{clientId}/{categoryId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Follow findById(@PathParam("clientId") long clientId, @PathParam("categoryId") long categoryId) {
        FollowId id = new FollowId(clientId, categoryId);
        return followDao.find(id);
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Follow create(Follow follow) {
        Follow f = followDao.find(new FollowId(follow.getClient().getId(), follow.getCategory().getId()));
        if (f != null) {
            if (f.getStatus() == 0) {
                f.setStatus(1);
            } else if (f.getStatus() == 1) {
                f.setStatus(0);
            }
            return followDao.update(f);
        } else {
            followDao.create(follow);
        }
        return follow;
    }
    
    @PUT
    @Path("{clientId}/{categoryId}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Follow edit(@PathParam("clientId") long clientId, @PathParam("categoryId") long categoryId, Follow follow) {
        follow.setId(new FollowId(clientId, categoryId));
        return followDao.update(follow);
    }
    
    @DELETE
    @Path("{clientId}/{categoryId}")
    public void remove(@PathParam("clientId") long clientId, @PathParam("categoryId") long categoryId) {
        FollowId id = new FollowId(clientId, categoryId);
        followDao.delete(id);
    }
    
}
