package com.toppickhub.service;

import com.toppickhub.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {
    @Autowired
    private ItemRepository itemRepository;

    public List<com.toppickhub.model.Item> getAllItems() {
        return itemRepository.findAll();
    }

    public com.toppickhub.model.Item getItemById(Long id) {
        return itemRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Item not found"));
    }
}

