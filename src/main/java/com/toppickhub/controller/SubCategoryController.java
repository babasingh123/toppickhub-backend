package com.toppickhub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/subcategories")
public class SubCategoryController {
    @Autowired
    private main.java.com.toppickhub.service.SubCategoryService subCategoryService;

    @GetMapping
    public List<main.java.com.toppickhub.model.SubCategory> getAllSubCategories() {
        return subCategoryService.getAllSubCategories();
    }

    @GetMapping("/{id}")
    public main.java.com.toppickhub.model.SubCategory getSubCategoryById(@PathVariable Long id) {
        return subCategoryService.getSubCategoryById(id);
    }
}

