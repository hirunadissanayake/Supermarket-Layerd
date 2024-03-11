/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package supermarket.layerd.dao.custom;

import supermarket.layerd.dao.CrudDao;
import supermarket.layerd.dao.SuperDao;
import supermarket.layerd.entity.CustomerEntity;

/**
 *
 * @author dell
 */
public interface CustomerDao extends CrudDao<CustomerEntity,String>{
    boolean add(CustomerEntity customerEntity)throws Exception;
    
}
