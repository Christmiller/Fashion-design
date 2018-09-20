/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.woystech.fasdes.services.impl;

import com.woystech.fasdes.dao.BaseDao;
import com.woystech.fasdes.dao.DesignerDao;
import com.woystech.fasdes.entities.Designer;
import com.woystech.fasdes.services.DesignerService;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author lupitisa
 */
@Stateless
public class DesignerServiceImpl extends BaseServiceImpl<Designer, Long> implements DesignerService{
    @EJB
    private DesignerDao designerDao;

    @Override
    protected BaseDao<Designer, Long> getDao() {
        return designerDao;
    }
    
    
}
