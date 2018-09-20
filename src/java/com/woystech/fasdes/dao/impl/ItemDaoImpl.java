/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.woystech.fasdes.dao.impl;

import com.woystech.fasdes.dao.ItemDao;
import com.woystech.fasdes.entities.Item;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author lupitisa
 */
@Stateless
public class ItemDaoImpl extends BaseDaoImpl<Item, Long> implements ItemDao {

    public ItemDaoImpl() {
        super(Item.class);
    }

    @Override
    public List<Item> findAllOrderByName() {
        try {
            return entityManager.createNamedQuery("Item.findAllOrderByName").getResultList();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<Item> findAllItemsByClient(long clientId) {
        try {
            return entityManager.createNamedQuery("Item.findItemsByClientId").setParameter("clientId", clientId).getResultList();
        } catch (Exception e) {
            return null;
        }
    }

}
