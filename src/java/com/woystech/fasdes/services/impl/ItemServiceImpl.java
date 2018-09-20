/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.woystech.fasdes.services.impl;

import com.woystech.fasdes.dao.BaseDao;
import com.woystech.fasdes.dao.ItemDao;
import com.woystech.fasdes.entities.Item;
import com.woystech.fasdes.services.ItemService;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author lupitisa
 */
@Stateless
public class ItemServiceImpl extends BaseServiceImpl<Item, Long> implements ItemService {
    @EJB
    private ItemDao ItemDao;

    @Override
    protected BaseDao<Item, Long> getDao() {
       return ItemDao;
    }
    
    
}
