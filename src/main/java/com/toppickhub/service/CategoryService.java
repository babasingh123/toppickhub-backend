package com.toppickhub.service;

import com.toppickhub.exception.ResourceNotFoundException;
import com.toppickhub.model.Category;
import com.toppickhub.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    public Category getCategoryById(Long id) {
        return categoryRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Category not found"));
    }

    public Category saveCategory(Category category) {
        return categoryRepository.save(category);
    }
}

