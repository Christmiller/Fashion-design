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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author lupitisa
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Item.findByCategoryId",query = "SELECT i FROM Item i WHERE i.category.id=:categoryId ORDER BY i.name"),
     @NamedQuery(name = "Item.findAllOrderByName",query = "SELECT i FROM Item i ORDER BY i.name"),
      @NamedQuery(name = "Item.findItemsByClientId",query = "SELECT i FROM Item i,Follow f WHERE i.category.id=f.category.id AND f.client.Id=:clientId AND f.status=1 ORDER BY i.name")
       
})
public class Item implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String imagePath;
    private int no_of_image;
    
    @ManyToOne
    private Category category;
    @OneToMany(mappedBy = "item")
    private List<Review> reviewList;

    public Item() {
    }

    public Item(String name) {
        this.name = name;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public int getNo_of_image() {
        return no_of_image;
    }

    public void setNo_of_image(int no_of_image) {
        this.no_of_image = no_of_image;
    }

    
    

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @XmlTransient
    public List<Review> getReviewList() {
        return reviewList;
    }

    public void setReviewList(List<Review> reviewList) {
        this.reviewList = reviewList;
    }
    
    

    
    
}
