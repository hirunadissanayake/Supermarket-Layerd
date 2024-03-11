/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket.layerd.controller;

import supermarket.layerd.dto.OrderDto;
import supermarket.layerd.service.ServiceFactory;
import supermarket.layerd.service.custom.OrderService;

/**
 *
 * @author dell
 */
public class OrderController {
    
    private OrderService orderService = (OrderService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.ORDER);

    public String placeOrder(OrderDto orderDto) throws Exception{
        return orderService.placeOrder(orderDto);
    }
    
}