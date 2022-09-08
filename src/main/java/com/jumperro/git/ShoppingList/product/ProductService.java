package com.jumperro.git.ShoppingList.product;

import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;


    }
}
