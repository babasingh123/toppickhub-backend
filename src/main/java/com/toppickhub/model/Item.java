package com.toppickhub.model;

import jakarta.persistence.*;

@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Integer rank;
    private String description;
    private String image;
    private String source;
    private Double averageRating;
    private Integer totalReviews;

    @ManyToOne
    @JoinColumn(name = "subcategory_id")
    private SubCategory subcategory;
}

