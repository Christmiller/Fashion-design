/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.woystech.fasdes.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author firok
 */
@Entity
public class Follow implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @EmbeddedId
    private FollowId id;
    
    @Temporal(TemporalType.DATE)
    private Date createdDate;
    
    @Temporal(TemporalType.DATE)
    private Date modifiedDate;
    
    private int status;
    
    @ManyToOne
    private Category category;
    
    @ManyToOne
    private Client client;

    public Follow() {
    }
    
    public Follow(FollowId id, Category category, Client client) {
        this.id = id;
        this.category = category;
        this.client = client;
    }
    
    @PrePersist
    public void prePersist(){
        id = new FollowId(getClient().getId(), getCategory().getId());
        createdDate = new Date();
        modifiedDate = new Date();
        status = 1;
    }
    
    @PreUpdate
    public void preUpdate(){
        modifiedDate = new Date();
    }

    public FollowId getId() {
        return id;
    }

    public void setId(FollowId id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    
    
    
}
