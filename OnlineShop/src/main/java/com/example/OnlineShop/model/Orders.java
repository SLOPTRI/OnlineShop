package com.example.OnlineShop.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Orders {

    @Id
    private int orderId;

    @ManyToOne
    @JoinColumn(name = "userId")
    private Users userId;
    private int orderState;

}
