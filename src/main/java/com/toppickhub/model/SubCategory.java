package com.toppickhub.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class SubCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String slug;
    private String description;
    private String image;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @OneToMany(mappedBy = "subcategory", cascade = CascadeType.ALL)
    private List<Item> items = new ArrayList<>();
}

