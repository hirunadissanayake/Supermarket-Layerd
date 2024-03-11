/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket.layerd.dao.custom.impl;

import java.util.ArrayList;
import supermarket.layerd.dao.CrudUtil;
import supermarket.layerd.dao.custom.OrderDetailDao;
import supermarket.layerd.entity.OrderDetailEntity;

/**
 *
 * @author dell
 */
public class OrderDetailDaoImpl implements OrderDetailDao {

    @Override
    public boolean add(OrderDetailEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO orderdetail VALUES(?,?,?,?)", t.getOrderId(), t.getItemId(), t.getQty(), t.getDiscount());
    }

    @Override
    public boolean update(OrderDetailEntity t) throws Exception {
        return false;
    }

    @Override
    public boolean delete(Object id) throws Exception {
        return false;
    }

    @Override
    public OrderDetailEntity get(Object id) throws Exception {
        return null;
    }

    @Override
    public ArrayList<OrderDetailEntity> getAll() throws Exception {
        return null;
    }

}