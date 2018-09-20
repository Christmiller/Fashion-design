/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.woystech.fasdes.webservices;

import com.woystech.fasdes.dao.ReviewDao;
import com.woystech.fasdes.entities.Review;
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
@Path("/reviews")
public class ReviewWService {

    @EJB
    ReviewDao reviewDao;

    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<Review> findAll() {
        return reviewDao.findAll();
    }

    @GET
    @Path("/{Id}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Review findById(@PathParam("id") Long id) {
        return reviewDao.find(id);

    }
//    @POST
//    @Path("/review/{name}")
//    @Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
//    public void createReview(@PathParam("name")String name){
//        Review review=new Review(name);
//        reviewDao.create(review);
//        
//        
//    }

}
