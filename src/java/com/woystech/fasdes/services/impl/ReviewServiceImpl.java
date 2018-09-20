/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.woystech.fasdes.services.impl;

import com.woystech.fasdes.dao.BaseDao;
import com.woystech.fasdes.dao.ReviewDao;
import com.woystech.fasdes.entities.Review;
import com.woystech.fasdes.services.ReviewService;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author lupitisa
 */
@Stateless
public class ReviewServiceImpl extends BaseServiceImpl<Review , Long> implements ReviewService{
    
    @EJB
    private ReviewDao reviewDao;

    @Override
    protected BaseDao<Review, Long> getDao() {
        return reviewDao;
    }
}
