/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.woystech.fasdes.dao.impl;

import com.woystech.fasdes.dao.ClientDao;
import com.woystech.fasdes.entities.Client;
import javax.ejb.Stateless;

/**
 *
 * @author lupitisa
 */
@Stateless
public class ClientDaoImpl extends BaseDaoImpl<Client, Long> implements ClientDao {
    
    public ClientDaoImpl(){
        
        super(Client.class);
    }

    @Override
    public Client findByEmailAndUsername(String email, String password) {
        try {
            return (Client) entityManager.createNamedQuery("Client.findByEmailAndPassword").setParameter("email", email).
                    setParameter("password", password).getSingleResult();
            
        } catch (Exception e) {
            return null;
        }
    }
    
}
