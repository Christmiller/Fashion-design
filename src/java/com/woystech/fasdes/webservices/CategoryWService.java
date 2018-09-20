/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.woystech.fasdes.webservices;

import com.woystech.fasdes.dao.CategoryDao;
import com.woystech.fasdes.entities.Category;
import com.woystech.fasdes.entities.Item;
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
@Path("/categories")
public class CategoryWService {

    @EJB
    CategoryDao categoryDao;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Category> findAll() {
        return categoryDao.findAll();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Category findById(@PathParam("id") Long id) {
        return categoryDao.find(id);
    }

    @GET
    @Path("/{id}/items")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Item> findAllItemsByCategory(@PathParam("id") Long id){
        return categoryDao.findItemsByCategoryId(id);
    }
}
