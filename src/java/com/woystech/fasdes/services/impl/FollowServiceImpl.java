/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.woystech.fasdes.services.impl;

import com.woystech.fasdes.dao.BaseDao;
import com.woystech.fasdes.dao.FollowDao;
import com.woystech.fasdes.entities.Follow;
import com.woystech.fasdes.entities.FollowId;
import com.woystech.fasdes.services.FollowService;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author firok
 */
@Stateless
public class FollowServiceImpl extends BaseServiceImpl<Follow, FollowId> implements FollowService {
    @EJB
    private FollowDao clientDao ;

    @Override
    protected BaseDao<Follow, FollowId> getDao() {
        return clientDao;
    }
    
}