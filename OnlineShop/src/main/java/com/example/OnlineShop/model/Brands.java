package com.example.OnlineShop.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Brands {

    @Id
    private int brandId;
    private String brandName;

}
