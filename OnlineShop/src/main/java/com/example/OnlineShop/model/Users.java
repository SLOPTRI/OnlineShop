package com.example.OnlineShop.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.context.annotation.Primary;

@Entity
public class Users {

    @Id
    private int userId;
    private String userEmail;
    private String userName;
    private int userTlf;

}
