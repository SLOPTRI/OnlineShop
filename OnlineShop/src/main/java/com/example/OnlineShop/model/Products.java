package com.example.OnlineShop.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Products {

    @Id
    private int productID;

    @ManyToOne
    @JoinColumn(name = "brandId")
    private Brands brandId;

    @ManyToOne
    @JoinColumn(name = "categoryId")
    private Categories categoryId;

    private String productName;
}
