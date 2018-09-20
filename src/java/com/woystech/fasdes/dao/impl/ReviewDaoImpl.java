/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.woystech.fasdes.dao.impl;
import com.woystech.fasdes.dao.ReviewDao;
import com.woystech.fasdes.entities.Review;
import javax.ejb.Stateless;


/**
 *
 * @author lupitisa
 */
@Stateless
public class ReviewDaoImpl extends BaseDaoImpl<Review, Long> implements ReviewDao{
    
    public ReviewDaoImpl(){
        super(Review.class);
    }
    
}
