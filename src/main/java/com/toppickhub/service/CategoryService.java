package com.toppickhub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private main.java.com.toppickhub.repository.CategoryRepository categoryRepository;

    public List<main.java.com.toppickhub.model.Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    public main.java.com.toppickhub.model.Category getCategoryById(Long id) {
        return categoryRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Category not found"));
    }

    public main.java.com.toppickhub.model.Category saveCategory(main.java.com.toppickhub.model.Category category) {
        return categoryRepository.save(category);
    }
}

