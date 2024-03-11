/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket.layerd.service.custom.impl;

import java.util.ArrayList;
import supermarket.layerd.dao.DaoFactory;
import supermarket.layerd.dao.custom.ItemDao;
import supermarket.layerd.dto.ItemDto;
import supermarket.layerd.entity.ItemEntity;
import supermarket.layerd.service.custom.ItemService;

/**
 *
 * @author dell
 */
public class ItemServiceImpl implements ItemService {

    ItemDao itemDao = (ItemDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.ITEM);

    @Override
    public String addItem(ItemDto dto) throws Exception {
        if (itemDao.add(new ItemEntity(dto.getId(), dto.getDescription(),
                dto.getPackSize(), dto.getUnitPrice(), dto.getQoh()))) {
            return "Successfully Saved";
        } else {
            return "Fail";
        }
    }

    @Override
    public String updateItem(ItemDto dto) throws Exception {
        if (itemDao.update(new ItemEntity(dto.getId(), dto.getDescription(),
                dto.getPackSize(), dto.getUnitPrice(), dto.getQoh()))) {
            return "Successfully Update";
        } else {
            return "Fail";
        }
    }

    @Override
    public String deleteItem(String id) throws Exception {
        if(itemDao.delete(id)){
            return "Successfully Delete";
        } else {
            return "Fail";
        }
    }

    @Override
    public ItemDto getItem(String id) throws Exception {
        ItemEntity entity = itemDao.get(id);
        return new ItemDto(entity.getId(), entity.getDescription(),
                entity.getPackSize(), entity.getUnitPrice(), entity.getQoh());
    }

    @Override
    public ArrayList<ItemDto> getAllItem() throws Exception {
        ArrayList<ItemDto> itemDtos = new ArrayList<>();
        
        ArrayList<ItemEntity> itemEntitys = itemDao.getAll();
        
        for (ItemEntity entity : itemEntitys) {
            ItemDto itemDto = new ItemDto(entity.getId(), entity.getDescription(),
                entity.getPackSize(), entity.getUnitPrice(), entity.getQoh());
            itemDtos.add(itemDto);
        }
        
        return itemDtos;
    }

}