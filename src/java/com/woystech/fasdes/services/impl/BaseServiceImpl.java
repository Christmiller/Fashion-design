/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.woystech.fasdes.services.impl;

import com.woystech.fasdes.dao.BaseDao;
import com.woystech.fasdes.services.BaseService;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author lupitisa
 */
public abstract class BaseServiceImpl<T, K extends Serializable> implements BaseService<T, K>{
    
    protected abstract BaseDao<T, K> getDao();

    @Override
    public void create(T t) {
        getDao().create(t);
    }

    @Override
    public T update(T t) {
        return getDao().update(t);
    }

    @Override
    public List<T> findAll() {
        return getDao().findAll();
    }

    @Override
    public T find(K k) {
        return getDao().find(k);
    }

    @Override
    public void delete(T t) {
        getDao().delete(t);
    }

    @Override
    public void delete(K k) {
        getDao().delete(k);
    }
    
}
