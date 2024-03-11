/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package supermarket.layerd.service.custom;

import supermarket.layerd.dto.OrderDto;
import supermarket.layerd.service.SuperService;

/**
 *
 * @author dell
 */
public interface OrderService extends SuperService{
    
    String placeOrder(OrderDto dto) throws Exception;
    
}