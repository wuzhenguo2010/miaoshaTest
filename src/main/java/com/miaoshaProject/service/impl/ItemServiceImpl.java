package com.miaoshaProject.service.impl;

import com.miaoshaProject.service.ItemService;
import com.miaoshaProject.service.model.ItemModel;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class ItemServiceImpl implements ItemService {

    @Override
    @Transactional
    public ItemModel createItem(ItemModel itemModel) {
        return null;
    }

    @Override
    public List<ItemModel> listItem() {
        return null;
    }

    @Override
    public ItemModel getItemById(Integer id) {
        return null;
    }
}
