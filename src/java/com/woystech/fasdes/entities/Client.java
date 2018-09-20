/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.woystech.fasdes.entities;

import java.util.List;
import javax.persistence.Entity;
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
    @NamedQuery(name = "Client.findByEmailAndPassword",query = "SELECT c FROM Client c WHERE c.email=:email AND c.password=:password"),    
})
public class Client extends AppUser {

    private String gender;
    @OneToMany(mappedBy = "client")
    private List<Review> reviewlist;

    @OneToMany(mappedBy = "client")
    private List<Follow> followList;

    public Client() {
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @XmlTransient
    public List<Review> getReviewlist() {
        return reviewlist;
    }

    public void setReviewlist(List<Review> reviewlist) {
        this.reviewlist = reviewlist;
    }

    public Client(String gender, String userName, String password, String phoneNumber, String email, Address address) {
        super(userName, password, phoneNumber, email, address);
        this.gender = gender;
    }

    @XmlTransient
    public List<Follow> getFollowList() {
        return followList;
    }

    public void setFollowList(List<Follow> followList) {
        this.followList = followList;
    }
    
    

}
