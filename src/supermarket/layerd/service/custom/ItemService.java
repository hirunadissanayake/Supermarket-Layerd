/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package supermarket.layerd.service.custom;

import java.util.ArrayList;
import supermarket.layerd.dto.ItemDto;
import supermarket.layerd.service.SuperService;

/**
 *
 * @author dell
 */
public interface ItemService extends SuperService{
     String addItem(ItemDto itemDto) throws Exception;

    String updateItem(ItemDto itemDto) throws Exception;

    String deleteItem(String id) throws Exception;

    ItemDto getItem(String id) throws Exception;

    ArrayList<ItemDto> getAllItem() throws Exception;
}