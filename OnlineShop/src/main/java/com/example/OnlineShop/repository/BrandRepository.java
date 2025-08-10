package com.example.OnlineShop.repository;

import com.example.OnlineShop.model.Brands;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends JpaRepository<Brands, Integer> {
}
