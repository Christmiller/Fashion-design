/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.woystech.fasdes.dao;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author lupitisa
 */
public interface BaseDao<T, K extends Serializable>{
    
    void create(T t);
    T update(T t);
    List<T> findAll();
    T find(K k);
    void delete(T t);
    void delete(K k);
    
}
