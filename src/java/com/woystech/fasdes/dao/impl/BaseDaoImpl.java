/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.woystech.fasdes.dao.impl;

import com.woystech.fasdes.dao.BaseDao;
import java.io.Serializable;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author lupitisa
 */
public class BaseDaoImpl<T, K extends Serializable> implements BaseDao<T, K>{
    
    @PersistenceContext(name = "FasdesPU")
    protected EntityManager entityManager;
    
    protected Class<T> type;

    public BaseDaoImpl() {
    }

    public BaseDaoImpl(Class<T> type) {
        this.type = type;
    }

    /**
     * This method adds an object t in a table or entity
     * @param t 
     */
    @Override
    public void create(T t) {
        entityManager.persist(t);
    }

    /**
     * This method update t object 
     * @param t is an object
     * @return 
     */
    @Override
    public T update(T t) {
        return entityManager.merge(t);
    }
    
    /**
     * This method retrieve all the data of T table
     * T refers to entity class
     * @return 
     */
    @Override
    public List<T> findAll() {
        Query query = entityManager.createQuery("SELECT t FROM "+ type.getSimpleName() +" t");
        return query.getResultList();
    }
    
    
    /**
     * This method retrieve an object T by its id value
     * @param k
     * @return 
     */
    @Override
    public T find(K k) {
       return entityManager.find(type, k);
    }

    /**
     * This method allow to delete data by an object 
     * @param t 
     */
    @Override
    public void delete(T t) {
        entityManager.remove(t);
    }

    /**
     * This method remove an object T by the help of the id
     * k refers to the id value
     * @param k 
     */
    @Override
    public void delete(K k) {
        entityManager.remove(find(k));
    }
    
}
