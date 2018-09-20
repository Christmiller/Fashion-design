/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.woystech.fasdes.webservices;

import com.woystech.fasdes.dao.ItemDao;
import com.woystech.fasdes.entities.Item;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author lupitisa
 */
@Path("/items")
public class ItemWService {

    @EJB
    ItemDao itemDao;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Item> findAll(@QueryParam("start") int start, @QueryParam("size") int size) {
        if (start > 0 && size > 0) {
            if (itemDao.findAll().size() > size) {
                return itemDao.findAll().subList(start, size);
            } else {
                return itemDao.findAll().subList(start, itemDao.findAll().size());
            }
        }
        return itemDao.findAll();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Item findById(@PathParam("id") Long id) {
        return itemDao.find(id);
    }

    @POST
    @Path("/item/{name}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void createItem(@PathParam("name") String name) {
        Item item = new Item(name);
        itemDao.create(item);

    }
}
