/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.woystech.fasdes.dao;

import com.woystech.fasdes.entities.Item;
import java.util.List;

/**
 *
 * @author lupitisa
 */
public interface ItemDao extends BaseDao<Item , Long> {
    
    List<Item> findAllOrderByName();
    
    List<Item> findAllItemsByClient(long clientId);
}
