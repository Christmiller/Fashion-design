/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.woystech.fasdes.dao.impl;

import com.woystech.fasdes.dao.FollowDao;
import com.woystech.fasdes.entities.Follow;
import com.woystech.fasdes.entities.FollowId;
import javax.ejb.Stateless;

/**
 *
 * @author firok
 */
@Stateless
public class FollowDaoImpl extends BaseDaoImpl<Follow, FollowId> implements FollowDao {
    
    public FollowDaoImpl(){
        
        super(Follow.class);
    }
    
}
