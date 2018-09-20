/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.woystech.fasdes.dao;

import com.woystech.fasdes.entities.Category;
import com.woystech.fasdes.entities.Item;
import java.util.List;

/**
 *
 * @author lupitisa
 */
public interface CategoryDao extends BaseDao<Category, Long>{
    
    List<Item> findItemsByCategoryId(long categoryId);
    
    List<Category> findAllCategoriesFollowByClient(long clientId);
    
    List<Category> findAllCategoriesNotFollowByClient(long clientId);
}
