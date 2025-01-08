package com.toppickhub.controller;

import com.toppickhub.model.SubCategory;
import com.toppickhub.service.SubCategoryService;
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
    private SubCategoryService subCategoryService;

    @GetMapping
    public List<SubCategory> getAllSubCategories() {
        return subCategoryService.getAllSubCategories();
    }

    @GetMapping("/{id}")
    public SubCategory getSubCategoryById(@PathVariable Long id) {
        return subCategoryService.getSubCategoryById(id);
    }
}

