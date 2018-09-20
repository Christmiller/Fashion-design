/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.woystech.fasdes.entities;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author firok
 */
@Embeddable
public class FollowId implements Serializable{
    
    protected long clientId;
    
    protected long categoryId;

    public FollowId() {
    }

    public FollowId(long clientId, long categoryId) {
        this.clientId = clientId;
        this.categoryId = categoryId;
    }

    public long getClientId() {
        return clientId;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }

    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }
    
    
}
