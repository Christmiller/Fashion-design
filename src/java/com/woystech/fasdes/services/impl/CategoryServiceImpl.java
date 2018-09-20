/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.woystech.fasdes.services.impl;

import com.woystech.fasdes.dao.BaseDao;
import com.woystech.fasdes.dao.CategoryDao;
import com.woystech.fasdes.entities.Category;
import com.woystech.fasdes.services.CategoryService;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author lupitisa
 */
@Stateless
public class CategoryServiceImpl extends BaseServiceImpl<Category, Long> implements CategoryService{
    
    @EJB
    private CategoryDao categoryDao;

    @Override
    protected BaseDao<Category, Long> getDao() {
        return categoryDao;
    }
    
}
