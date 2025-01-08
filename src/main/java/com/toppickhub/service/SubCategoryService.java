package com.toppickhub.service;

import com.toppickhub.repository.SubCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubCategoryService {
    @Autowired
    private SubCategoryRepository subCategoryRepository;

    public List<main.java.com.toppickhub.model.SubCategory> getAllSubCategories() {
        return subCategoryRepository.findAll();
    }

    public main.java.com.toppickhub.model.SubCategory getSubCategoryById(Long id) {
        return subCategoryRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("SubCategory not found"));
    }
}

