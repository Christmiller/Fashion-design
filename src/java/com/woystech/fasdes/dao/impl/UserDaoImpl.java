/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.woystech.fasdes.dao.impl;

import com.woystech.fasdes.dao.UserDao;
import com.woystech.fasdes.entities.AppUser;
import javax.ejb.Stateless;

/**
 *
 * @author lupitisa
 */
@Stateless
public class UserDaoImpl extends BaseDaoImpl<AppUser, Long> implements UserDao{

    public UserDaoImpl() {
        super(AppUser.class);
    }
    
    
}
