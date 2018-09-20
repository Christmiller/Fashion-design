/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.woystech.fasdes.services;

import com.woystech.fasdes.entities.Client;

/**
 *
 * @author lupitisa
 */
public interface ClientService extends BaseService<Client, Long> {
    Client findByEmailAndUsername(String email, String password);
}
