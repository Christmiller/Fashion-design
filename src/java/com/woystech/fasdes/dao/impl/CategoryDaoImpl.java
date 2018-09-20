/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.woystech.fasdes.dao.impl;

import com.woystech.fasdes.dao.CategoryDao;
import com.woystech.fasdes.entities.Category;
import com.woystech.fasdes.entities.Item;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author lupitisa
 */
@Stateless
public class CategoryDaoImpl extends BaseDaoImpl<Category, Long> implements CategoryDao{

    public CategoryDaoImpl() {
       
        super(Category.class);
    }

     @Override
    public List<Item> findItemsByCategoryId(long categoryId) {
        try {
            return entityManager.createNamedQuery("Item.findByCategoryId").setParameter("categoryId", categoryId).getResultList();
        } catch (Exception e) {
            return null;
        }

    }

    @Override
    public List<Category> findAllCategoriesFollowByClient(long clientId) {
         try {
            return entityManager.createNamedQuery("Category.findAllCategoriesFollowByClient").setParameter("clientId", clientId).getResultList();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<Category> findAllCategoriesNotFollowByClient(long clientId) {
         try {
            return entityManager.createNamedQuery("Category.findAllCategoriesNotFollowByClient").setParameter("clientId", clientId).getResultList();
        } catch (Exception e) {
            return null;
        }
    }
    
}
