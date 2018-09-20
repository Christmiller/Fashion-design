/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.woystech.fasdes.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author lupitisa
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Category.findAllCategoriesFollowByClient", query = "SELECT f.category FROM Follow f WHERE f.client.Id=:clientId AND f.status=1"),
    @NamedQuery(name = "Category.findAllCategoriesNotFollowByClient", query = "SELECT c FROM Category c WHERE c.id NOT IN (SELECT f.category.id FROM Follow f WHERE f.client.Id=:clientId AND f.status=1)")

})
public class Category implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String imagePath;
    @OneToMany(mappedBy = "category")
    private List<Item> itemList;

    @OneToMany(mappedBy = "category")
    private List<Follow> followList;

    public Category() {
    }

    public Category(String name) {
        this.name = name;
    }

    public Category(String name, String imagePath) {
        this.name = name;
        this.imagePath = imagePath;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    @XmlTransient
    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }
    
   @XmlTransient
    public List<Follow> getFollowList() {
        return followList;
    }

    public void setFollowList(List<Follow> followList) {
        this.followList = followList;
    }

}
