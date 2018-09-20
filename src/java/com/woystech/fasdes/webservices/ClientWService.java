/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.woystech.fasdes.webservices;

import com.woystech.fasdes.dao.CategoryDao;
import com.woystech.fasdes.dao.ClientDao;
import com.woystech.fasdes.dao.ItemDao;
import com.woystech.fasdes.entities.Category;
import com.woystech.fasdes.entities.Client;
import com.woystech.fasdes.entities.Item;
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
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author lupitisa
 */
@Path("/clients")
public class ClientWService {

    @EJB
    ClientDao clientDao;

    @EJB
    CategoryDao categoryDao;

    @EJB
    ItemDao itemDao;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Client> findAll() {
        return clientDao.findAll();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Client findById(@PathParam("id") Long id) {
        return clientDao.find(id);
    }
    
    @GET
    @Path("/login")
    @Produces(MediaType.APPLICATION_JSON)
    public Client findById(@QueryParam("email") String email, @QueryParam("password") String password) {
        return clientDao.findByEmailAndUsername(email, password);
    }

    @GET
    @Path("/{id}/follows/categories")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Category> findAllCategoryFollowByClient(@PathParam("id") long clientId, @QueryParam("start") int start, @QueryParam("size") int size) {
        List<Category> categoryList = categoryDao.findAllCategoriesFollowByClient(clientId);
        if (start > 0 && size > 0) {
            if (categoryList.size() > size) {
                return categoryList.subList(start, size);
            } else {
                return categoryList.subList(start, categoryList.size());
            }
        }
        return categoryList;
    }

    @GET
    @Path("/{id}/notfollows/categories")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Category> findAllCategoryNotFollowByClient(@PathParam("id") long clientId, @QueryParam("start") int start, @QueryParam("size") int size) {
        List<Category> categoryList = categoryDao.findAllCategoriesNotFollowByClient(clientId);
        if (start > 0 && size > 0) {
            if (categoryList.size() > size) {
                return categoryList.subList(start, size);
            } else {
                return categoryList.subList(start, categoryList.size());
            }
        }
        return categoryList;
    }

    @GET
    @Path("/{id}/follows/items")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Item> findAllItemsFollowByClient(@PathParam("id") long clientId, @QueryParam("start") int start, @QueryParam("size") int size) {
        List<Item> itemList = itemDao.findAllItemsByClient(clientId);
        if (start > 0 && size > 0) {
            if (itemList.size() > size) {
                return itemList.subList(start, size);
            } else {
                return itemList.subList(start, itemList.size());
            }
        }
        return itemList;
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Client create(Client client) {
        clientDao.create(client);
        return client;
    }

    @PUT
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Client edit(@PathParam("id") Long id, Client client) {
        return clientDao.update(client);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Long id) {
        clientDao.delete(id);
    }

}
