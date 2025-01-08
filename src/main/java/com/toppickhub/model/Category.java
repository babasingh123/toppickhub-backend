package com.toppickhub.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String slug;
    private String description;
    private String image;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private List<SubCategory> subcategories = new ArrayList<>();
}

