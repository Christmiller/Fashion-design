/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.woystech.fasdes.services.impl;

import com.woystech.fasdes.dao.BaseDao;
import com.woystech.fasdes.dao.ClientDao;
import com.woystech.fasdes.entities.Client;
import com.woystech.fasdes.services.ClientService;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author lupitisa
 */
@Stateless
public class ClientServiceImpl extends BaseServiceImpl<Client, Long> implements ClientService {
    @EJB
    private ClientDao clientDao ;

    @Override
    protected BaseDao<Client, Long> getDao() {
        return clientDao;
    }

    @Override
    public Client findByEmailAndUsername(String email, String password) {
        return clientDao.findByEmailAndUsername(email, password);
    }
    
}