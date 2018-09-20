/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.woystech.fasdes.dao.impl;

import com.woystech.fasdes.dao.DesignerDao;
import com.woystech.fasdes.entities.Designer;
import javax.ejb.Stateless;

/**
 *
 * @author lupitisa
 */
@Stateless
public class DesignerDaoImp extends BaseDaoImpl<Designer, Long> implements DesignerDao{
    
    public DesignerDaoImp(){
        
        super(Designer.class);
    }
    
}
