/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.woystech.fasdes.services.impl;

import com.woystech.fasdes.dao.BaseDao;
import com.woystech.fasdes.dao.UserDao;
import com.woystech.fasdes.entities.AppUser;
import com.woystech.fasdes.services.UserService;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author lupitisa
 */
@Stateless
public class UserServiceImpl extends BaseServiceImpl<AppUser, Long> implements UserService{
    @EJB
    private UserDao userDao;

    @Override
    protected BaseDao<AppUser, Long> getDao() {
        return userDao;
    }
    
    
}
