package com.example.OnlineShop.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Categories {

    @Id
    private int categoryId;
    private String categoryName;

}
